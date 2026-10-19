class Solution {
    public int totalFruit(int[] fruits) {
        int l=0,r=0,k=0,max=0;
        HashMap<Integer,Integer> m=new HashMap<>();
        while(r<fruits.length){
            if(!m.containsKey(fruits[r])){
                if(k<2){
                    m.put(fruits[r],m.getOrDefault(fruits[r],0)+1);
                    k++;
                }else{
                    while(k>=2){
                        m.put(fruits[l],m.get(fruits[l])-1);
                        if(m.get(fruits[l])==0){
                            m.remove(fruits[l]);
                            k--;
                        }
                        l++;
                    }
                    m.put(fruits[r],m.getOrDefault(fruits[r],0)+1);
                    k++;
                }
            }
            else{
                m.put(fruits[r],m.get(fruits[r])+1);
            }
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}