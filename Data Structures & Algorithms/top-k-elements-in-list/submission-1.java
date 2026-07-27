class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)-> m.get(b)-m.get(a));
        for(int key:m.keySet()){
            pq.add(key);
        }
        int a[]=new int[k];
        int i=0;
        while(k-->0){
            a[i++]=pq.poll();
        }
        return a;
    }
}
