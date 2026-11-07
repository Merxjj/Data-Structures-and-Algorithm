
class Solution {

    public void heapify(int[] arr, int n, int i) {

        int largest = i;

        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Check left child
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // Check right child
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // Swap if root is not largest
        if (largest != i) {

            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Heapify the affected subtree
            heapify(arr, n, largest);
        }
    }

    public int[] sortArray(int[] nums) {

        int n = nums.length;

        // Step 1: Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(nums, n, i);
        }

        // Step 2: Extract maximum elements
        for (int i = n - 1; i > 0; i--) {

            // Swap root with last element
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;

            // Heapify reduced heap
            heapify(nums, i, 0);
        }

        return nums;
    }
}
