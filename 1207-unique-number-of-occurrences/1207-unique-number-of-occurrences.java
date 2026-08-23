class Solution {
    public boolean uniqueOccurrences(int[] arr) {
       HashMap<Integer,Integer> hm = new HashMap<>();
       HashSet<Integer> hs = new HashSet<>();

       for(int n : arr){
           hm.put(n,hm.getOrDefault(n,0)+1);
       } 
       for(int n : hm.values()){
            if(!hs.contains(n)){
                hs.add(n);
            }else{
            return false;
            }
       }

       return true;
    }
}