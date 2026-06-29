class Solution {
    public int[][] imageSmoother(int[][] img) {
        int n=img.length;
        int m=img[0].length;

        int arr[][]=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=img[i][j];
            }
        }
        int dx[]={-1,-1,0,1,1,1,0,-1};
        int dy[]={0,1,1,1,0,-1,-1,-1};
        int ni=0;
        int nj=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int count=1;
                int sum=arr[i][j];
                for(int k=0;k<8;k++){
                    ni=i+dx[k];
                    nj=j+dy[k];
                    if(ni>=0 && ni<n && nj>=0 && nj<m){
                        sum+=arr[ni][nj];
                        count++;
                    }
                }
                img[i][j]=sum/count;
            }
        }
        return img;
    }
}