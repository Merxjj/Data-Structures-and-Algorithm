class rain {
    public static void main(String args[]) {
        int[] arr = {2, 3, 7, 4, 8};
        int[] temp = new int[arr.length];
        int[] temp2 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            temp2[i] = arr[i];
        }

        for (int i = arr.length - 1; i > 0; i--) {
            if (temp2[i] > temp2[i - 1]) {
                temp2[i - 1] = temp2[i];
            }
        }

        for (int i = 0; i < temp2.length; i++) {
            System.out.print(temp2[i] + " ");
        }
        
        System.out.println();
        
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (temp[i] > temp[i + 1]) {
                temp[i + 1] = temp[i];
            }
        }

        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}

