class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> s=new HashSet<>();
        int m=0;
        for(int n:nums){
            s.add(n);
        }
        for(int k:s){
            int l=1;
            int curr=k;
            while(s.contains(curr+1)){
                curr++;
                l++;
            }
            m=Math.max(l,m);
        }
        return m;
    }
}
