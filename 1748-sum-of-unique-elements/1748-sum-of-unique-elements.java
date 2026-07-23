class Solution {
    public int sumOfUnique(int[] nums) {
        int n=nums.length;
        int sum=0;
        int[][] arr=new int[n][2];
        Arrays.sort(nums);
        arr[0][0]=nums[0];

        for(int i=1;i<n;i++){
            if(arr[i-1][0]!=nums[i]){
                arr[i][0]=nums[i];
            }
            
        }
        for(int i=0;i<n;i++){
            int num=arr[i][0];
            for(int j=0;j<n;j++){
                if(num==nums[j]){
                    arr[i][1]++;
                }
            }
            if(arr[i][1]==1){
                sum+=arr[i][0];
            }
        }
        return sum;
    }
}