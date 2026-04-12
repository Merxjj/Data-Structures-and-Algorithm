class Solution {
    public String reorganizeString(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<>(
            (a, b) -> freq.get(b) - freq.get(a)
        );
        //pq.addAll(freq.keySet());  or
        for(int key : freq.keySet()){
            pq.add(key);
        }
        StringBuilder result = new StringBuilder();
        while (pq.size() > 1) {
            char first = pq.poll();
            char second = pq.poll();


            result.append(first);
            result.append(second);


            freq.put(first, freq.get(first) - 1);
            freq.put(second, freq.get(second) - 1);


            if (freq.get(first) > 0) pq.offer(first);
            if (freq.get(second) > 0) pq.offer(second);
        }


        if (!pq.isEmpty()) {
            char last = pq.poll();
            if (freq.get(last) > 1) return "";
            result.append(last);
        }


        return result.toString();
    }
}
