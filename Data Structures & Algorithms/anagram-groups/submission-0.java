class Solution {
    public static boolean fun(String s,String p){
        if(s.length()!=p.length()){
            return false;
        }
        HashMap<Character,Integer> m1=new HashMap<>();
        HashMap<Character,Integer> m2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            m1.put(s.charAt(i),m1.getOrDefault(s.charAt(i),0)+1);
            m2.put(p.charAt(i),m2.getOrDefault(p.charAt(i),0)+1);
        }
        return m1.equals(m2);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> p=new ArrayList<>();
        int v[]=new int[strs.length];
        for(int i=0;i<strs.length;i++){
            if(v[i]==1)continue;
            List<String> l=new ArrayList<>();
            v[i]=1;
            l.add(strs[i]);
            for(int j=i+1;j<strs.length;j++){
                if(v[j]==0 && fun(strs[i],strs[j])){
                    l.add(strs[j]);
                    v[j]=1;
                }
            }
            p.add(l);
        }
        return p;
    }
}
