class MinMax {
    public static int[] mm(int arr[], int low, int high) {
        int[] temp = new int[2]; // temp[0] -> min, temp[1] -> max

        if (low == high) { 
            temp[0] = arr[low];
            temp[1] = arr[low];
            return temp;
        }

        if (low == high - 1) { 
            temp[0] = Math.min(arr[low], arr[high]);
            temp[1] = Math.max(arr[low], arr[high]);
            return temp;
        }

        int mid = low + (high - low) / 2;
        int[] left = mm(arr, low, mid);
        int[] right = mm(arr, mid + 1, high);

        temp[0] = Math.min(left[0], right[0]); // min
        temp[1] = Math.max(left[1], right[1]); // max

        return temp;
    }

    public static void main(String[] args) {
        int[] arr = {12, 5, 20, 8, 15, 2, 30};
        int[] result = mm(arr, 0, arr.length - 1);
        System.out.println("Minimum: " + result[0]);
        System.out.println("Maximum: " + result[1]);
    }
}
 