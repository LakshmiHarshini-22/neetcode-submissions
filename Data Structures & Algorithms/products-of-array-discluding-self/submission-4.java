class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p[]=new int[nums.length];
        int k=1,n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                n++;
            }else{
                k*=nums[i];
            }
        }
        if(n==nums.length){
            Arrays.fill(p,0);
        }else{
            for(int i=0;i<nums.length;i++){
                if(n>=1 && nums[i]!=0){
                    p[i]=0;
                }else if(n>=1 && nums[i]==0){
                    if(n==1){
                        p[i]=k;
                    }else{
                        p[i]=0;
                    }
                }else{
                    p[i]=k/nums[i];
                }
            }
        }
        return p;
    }
}  
