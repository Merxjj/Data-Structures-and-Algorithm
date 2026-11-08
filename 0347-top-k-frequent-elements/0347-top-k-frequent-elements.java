
class Solution {

    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: Count frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create buckets
        List<Integer>[] bucket = new List[nums.length + 1];

        // Step 3: Place elements into frequency buckets
        for(int key : map.keySet()) {

            int freq = map.get(key);

            if(bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }

            bucket[freq].add(key);
        }

        // Step 4: Extract top K frequent elements
        int[] result = new int[k];
        int index = 0;

        for(int i = bucket.length - 1; i >= 0; i--) {

            if(bucket[i] != null) {

                for(int num : bucket[i]) {

                    result[index] = num;
                    index++;

                    if(index == k) {
                        return result;
                    }
                }
            }
        }

        return result;
    }
}
