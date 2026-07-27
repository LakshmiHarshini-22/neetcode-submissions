class Solution {
    public boolean isPalindrome(String s) {
        String res = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int l=0,r=res.length()-1;
        while(l<r){
            if(res.charAt(l)==res.charAt(r)){
                l++;
                r--;
            }else{
                return false;
            }
        }
        return true;
    }
}
