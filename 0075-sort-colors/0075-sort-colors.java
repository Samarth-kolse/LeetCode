class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int lo=0;
        int mid=0;
        int hi=n-1;
        while(mid<=hi){
            if(nums[mid]==2){
                int temp=nums[hi];
                nums[hi]=nums[mid];
                nums[mid]=temp;
                hi--;
            }else if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[lo];
                nums[lo]=temp;
                mid++;
                lo++;
            }else{
                mid++;
            }
        }

    }
}