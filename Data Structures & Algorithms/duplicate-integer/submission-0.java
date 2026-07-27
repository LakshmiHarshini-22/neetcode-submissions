class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!m.containsKey(nums[i])){
                m.put(nums[i],1);
            }
            else{
                return true;
            }
        }
        return false;
    }
}