class Solution {
    public int longestConsecutive(int[] nums) {
        int max=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int p=nums[i];
            int c=1;
            for(int j=i+1;j<nums.length;j++){
                if(p+1==nums[j]){
                    c++;
                    p=nums[j];
                }
            }
            max=Math.max(c,max);
        }
        return max;
    }
}
