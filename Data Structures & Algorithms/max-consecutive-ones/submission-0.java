class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int r=0,count=0,max=Integer.MIN_VALUE;
        while(r<nums.length){
            if(nums[r]==1){
                count++;
            }else{
                max=Math.max(max,count);
                count=0;
            }
            r++;
        }
        max=Math.max(max,count);
        return max;
    }
}