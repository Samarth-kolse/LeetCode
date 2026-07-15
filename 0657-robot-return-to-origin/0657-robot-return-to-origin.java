class Solution {
    public boolean judgeCircle(String moves) {
        int n=moves.length();
        int x=0;
        int y=0;
        for(int i=0;i<n;i++){
            char ch=moves.charAt(i);
            switch(ch){
                case 'R':
                    x++;
                    break;
                case 'L':
                    x--;
                    break;
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
            }
        }
        if(x!=0 || y!=0){
            return false;
        }else{
            return true;
        }

        
    }
}