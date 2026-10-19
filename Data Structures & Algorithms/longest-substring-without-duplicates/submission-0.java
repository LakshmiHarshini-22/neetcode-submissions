class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,r=0,max=0;
        HashMap<Character,Integer> m=new HashMap<>();
        while(r<s.length()){
            if(!m.containsKey(s.charAt(r))){
                m.put(s.charAt(r),1);
            }else{
                while(s.charAt(l)!=s.charAt(r)){
                    m.remove(s.charAt(l));
                    l++;
                }
                m.remove(s.charAt(l));
                l++;
                m.put(s.charAt(r),1);
            }
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}
