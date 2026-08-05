class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;
        int ans=0;
        while(i<j){
            if(height[i]>height[j]){
                int area=height[j]*(j-i);
                ans=Math.max(ans,area);
                j--;
            }else{
                int area=height[i]*(j-i);
                ans=Math.max(ans,area);
                i++;
            }
        }
        return ans;
    }
}