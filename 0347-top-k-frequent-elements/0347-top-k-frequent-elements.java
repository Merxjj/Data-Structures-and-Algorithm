class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        Integer[] arr = map.keySet().toArray(new Integer[0]);
        Arrays.sort(arr,(a,b)->{
            int res = map.get(b)-map.get(a);
            if(res == 0) return a-b;
            return res;
        });
        int l = 0,i=0;
        int[] result = new int[k];
        while(l<k && i<arr.length){
            if(i == 0){
                result[l] = arr[i];
                l++;
                i++;
                continue;
                }
            if(arr[i-1]!=arr[i]){
                result[l] = arr[i];
                l++;
            }
            i++;
        }
        return result;
        
        
    }
}