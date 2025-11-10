public class sorting {
    public static void mergeSort(int arr[], int low, int high) {
        if (low >= high) return;
        int mid = low + (high - low) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low, j = mid + 1, k = 0;
        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) temp[k++] = arr[i++];
            else temp[k++] = arr[j++];
        }
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= high) temp[k++] = arr[j++];
        for (k = 0, i = low; k < temp.length; k++, i++) arr[i] = temp[k];
    }

    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i], j = i - 1;
            while (j >= 0 && arr[j] > key) arr[j + 1] = arr[j--];
            arr[j + 1] = key;
        }
    }

    public static int Partition(int arr[], int lb, int ub) {
        int pivot = arr[lb], start = lb, end = ub;
        while (start < end) {
            while (start <= ub && arr[start] <= pivot) start++;
            while (arr[end] > pivot) end--;
            if (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        int temp = arr[lb];
        arr[lb] = arr[end];
        arr[end] = temp;
        return end;
    }

    public static void quicksort(int arr[], int lb, int ub) {
        if (lb < ub) {
            int loc = Partition(arr, lb, ub);
            quicksort(arr, lb, loc - 1);
            quicksort(arr, loc + 1, ub);
        }
    }

    public static void printArray(int arr[]) {
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String Args[]) {
        int[] arr = {25, 20, 15, 35, 80, 50, 90, 45};
        int low = 0, high = arr.length - 1;

        mergeSort(arr, low, high);
        // bubbleSort(arr);
        // insertionSort(arr);
        //quicksort(arr, low, high);

        printArray(arr);
    }
}
