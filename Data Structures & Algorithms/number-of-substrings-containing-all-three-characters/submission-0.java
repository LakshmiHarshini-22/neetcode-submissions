class Solution {
    public int numberOfSubstrings(String s) {
        int l=0,r=0,count=0,k=0;
        HashMap<Character,Integer> m=new HashMap<>();
        while(r<s.length()){
            if(!m.containsKey(s.charAt(r))){
                m.put(s.charAt(r),1);
                k++;
            }
            else{
                m.put(s.charAt(r),m.get(s.charAt(r))+1);
            }
            while(k==3){
                count+=s.length()-r;
                m.put(s.charAt(l),m.get(s.charAt(l))-1);
                if(m.get(s.charAt(l))==0){
                    m.remove(s.charAt(l));
                    k--;
                }
                l++;
            }
            r++;
        }
        return count;
    }
}
