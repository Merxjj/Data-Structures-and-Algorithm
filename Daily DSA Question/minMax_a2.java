public class minMax {
    public static int[] minmaxx(int[] arr, int low, int high) {
        if (low == high) {
            return new int[]{arr[low], arr[low]};
        }

        if (high == low + 1) {
            if (arr[low] < arr[high]) {
                return new int[]{arr[low], arr[high]};
            } else {
                return new int[]{arr[high], arr[low]};
            }
        }

        int mid = low + (high - low) / 2;
        int[] left = minmaxx(arr, low, mid);
        int[] right = minmaxx(arr, mid + 1, high);

        return new int[]{Math.min(left[0], right[0]), Math.max(left[1], right[1])};
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 1, 8, 3};
        int[] result = minmaxx(arr, 0, arr.length - 1);
        System.out.println(result[0] + " " + result[1]);
    }
}
