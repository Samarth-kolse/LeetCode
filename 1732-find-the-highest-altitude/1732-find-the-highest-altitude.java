class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int max=0;
        int num=0;
        for(int i=0;i<n;i++){
            num=(num)+(gain[i]);
            if(num>max){
                max=num;
            }
        }
        return max;
    }
}