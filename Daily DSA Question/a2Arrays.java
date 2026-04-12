import java.util.*;
public class a2Arrays {
    //array is always passed as reference in java
    //function to print subarrays for n elements -> n(n+1)/2 subarrays exist
    //normal method 
    public static void subarrays(int arr[]){
        for(int i= 0;i<arr.length;i++){
            for(int j= i;j<arr.length;j++){
                for(int k = i;k<=j;k++){
                    System.out.print(arr[k]);
                }
                System.out.println();
            }
        }
    }
    //maximum subarray normal method 
    public static int maxsub(int arr[]){
        int currSum = 0;
        int maxSum = 0;
        for(int i = 0;i<arr.length ;i++){
            currSum = 0;
            for(int j = i;j<arr.length ;j++){
              
                    currSum += arr[j];
                    maxSum = (int)(Math.max(currSum,maxSum));
                }
            }
        
        return maxSum;
    }

    //maximum subarray using prefix sum
    public static void subarrySum(int arr[]) {
        int
        
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(arr.length);
        subarrays(arr);
        System.out.println("maxsum = "+ maxsub(arr));
    }



}
