class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;

        int i=0;
        int j=n-1;
        int k=n-1;
        int arr[]=new int[n];
        while(i<=j){
            if(nums[i]*nums[i]>nums[j]*nums[j]){
                arr[k]=nums[i]*nums[i];
                i++;
            }else{
                arr[k]=nums[j]*nums[j];
                j--;

            }
            k--;
        }
        return arr;
    }
}