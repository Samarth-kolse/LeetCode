class Solution {
    public boolean find(int x, int sqrt){
        if(sqrt <= x/sqrt) return true;
        else return false;
    }
    public int mySqrt(int x) {
        if(x == 0)return 0;
        int s =1, e=x, ans=0;
        while(s<=e){
            int mid = s+(e-s)/2;
            boolean flag = find(x,mid);
            if(flag == true){
                ans =mid;
                s = mid+1;
            }else{
                e= mid-1;
            }
        }
        return ans;
    }
}