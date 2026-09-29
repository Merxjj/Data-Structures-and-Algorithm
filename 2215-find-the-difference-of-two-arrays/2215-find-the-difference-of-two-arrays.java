class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> h1 = new HashSet<>();
        HashSet<Integer> h2 = new HashSet<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        List<List<Integer>> arr3 = new ArrayList<>();

        for(int n : nums1){
            h1.add(n);
        }
        for(int n : nums2){
            h2.add(n);
        }
        for(int n : h1){
            if(!h2.contains(n))arr1.add(n);
        }
        for(int n : h2){
            if(!h1.contains(n))arr2.add(n);
        }

        
        arr3.add(arr1);
        arr3.add(arr2);
        return arr3;
    }
}