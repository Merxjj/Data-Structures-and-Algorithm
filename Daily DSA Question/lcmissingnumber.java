public class lcmissingnumber {

    public static void main(String[] args)
    {   int n = 5,num;
        int totalsum = 0,arrsum = 0;
        int[] arr1 = new int[n];
        for(int i = 0;i<n;i++) arr1[i] = i;
        totalsum = (n*(n+1))/2;
        for(int i = 0;i<n ;i++) arrsum += arr1[i];
        num = totalsum - arrsum;
        System.out.println("missing number is "+ num);
    }
    
}

/* public class num {

    public static void main(String[] args) {
        int n = 5, num;
        int totalsum = 0, arrsum = 0;
        int[] arr1 = new int[n]; // Initialize the array
        
        for (int i = 0; i < n; i++) {
            arr1[i] = i; // Populate the array with numbers from 0 to n-1
        }
        
        totalsum = (n * (n + 1)) / 2; // Sum of first n natural numbers

        for (int i = 0; i < n; i++) {
            arrsum += arr1[i]; // Sum of elements in the array
        }
        
        num = totalsum - arrsum; // Find the missing number
        System.out.println("missing number is " + num);
    }
}*/
