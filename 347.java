class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer> pq= new PriorityQueue<>((a,b)-> map.get(b)- map.get(a));
        for(int num: map.keySet()){
            pq.add(num);
        }
        int []res= new int[k];
        int ind=0;
        while(!pq.isEmpty() && ind<k){
            res[ind]=pq.poll();
            ind++;
        }
        return res;
    }
}
