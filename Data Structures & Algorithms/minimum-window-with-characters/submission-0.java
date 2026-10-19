class Solution {
    public String minWindow(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(n==0 || m==0 || n<m){
            return "";
        }
        int c[]=new int[126];
        for(int i=0;i<m;i++){
            c[t.charAt(i)]++;
        }
        int l=0,r=0,matched=0;
        int min=Integer.MAX_VALUE;
        String answer="";
        int ma[]=new int[126];
        while(r<n){
            ma[s.charAt(r)]++;
            if(ma[s.charAt(r)]>0 && ma[s.charAt(r)]<=c[s.charAt(r)]){
                matched++;
            }
            while(matched==m){
                int curr=r-l+1;
                if(curr<min){
                    min=curr;
                    answer=s.substring(l,r+1);
                }
                ma[s.charAt(l)]--;
                if(ma[s.charAt(l)]<c[s.charAt(l)]){
                    matched--;
                }
                l++;
            }
            r++;
        }
        return answer;
    }
}
