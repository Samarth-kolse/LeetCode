class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        ArrayList<Integer> res = new ArrayList<>();

        int var = nums[0];
        int i=0;
        while(var <= nums[n-1]){
            if(nums[i] != var){
                System.out.println(var);
                res.add(var);
            }else if(i<n-1){
                i++;
            }
            var++;

        }
        return res;
    }
}