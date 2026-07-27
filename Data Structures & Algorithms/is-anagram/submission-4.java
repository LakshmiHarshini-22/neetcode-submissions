class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        int f1[]=new int[26];
        int f2[]=new int[26];
        for(int i=0;i<s.length();i++){
            f1[s.charAt(i)-'a']=f1[s.charAt(i)-'a']+1;
            f2[t.charAt(i)-'a']=f2[t.charAt(i)-'a']+1;
        }
        for(int i=0;i<f1.length;i++){
            if(f1[i]!=f2[i]){
                return false;
            }
        }
        return true;
    }
}
