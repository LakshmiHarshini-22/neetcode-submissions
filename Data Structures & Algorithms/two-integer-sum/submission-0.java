class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!m.containsKey(nums[i])){
                m.put(nums[i],i);
            }
        }
        int c[]=new int[2];
        for(int i=0;i<nums.length;i++){
            if(m.containsKey(target-nums[i])){
                if(i<m.get(target-nums[i])){
                    c[0]=i;
                    c[1]=m.get(target-nums[i]);
                }else{
                    c[0]=m.get(target-nums[i]);
                    c[1]=i;
                }
            }
        }
        return c;
    }
}
