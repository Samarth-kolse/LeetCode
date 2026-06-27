class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;

        int rowflg=0;
        int colflg=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                    
                    if(j==0) colflg=1;
                    if(i==0) rowflg=1;

                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[0][j]==0 || matrix[i][0]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(colflg==1){
            for(int k=0;k<n;k++) {
                matrix[k][0]=0;
            }
        }
        if(rowflg==1){
            for(int k=0;k<m;k++){
                matrix[0][k]=0;
            }
        }
        
    }
}