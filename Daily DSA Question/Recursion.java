
import java.util.*;
public class Recursion {
    public static void printDec(int n){
        System.out.println(n);
        if (n==1 ) return;

        printDec(n-1);
    }

    public static boolean ratMaze(int arr[][], int m, int n , int r , int c  ){
        if(m == r && n==c ){
            return true ;
        }
        // right
        if(arr[m+1][n ]== 0 && m+1 <= r ){
           if(ratMaze(arr, m+1, n, r, c)) return true;
        }
        if(arr[m][n+1]== 0&& n+1 <=c){
            if(ratMaze(arr, m, n+1, r, c)) return true;
                }

        return false;
        


    }
    public static void printInc(int n){
        if(n==1 ){ System.out.println(n);
        return ;}
        
        printInc(n-1);
        System.out.println(n );
        
    }
    public static int fact(int n){
        if (n==0) return 1;

        return n*fact(n-1);
    }

    public static int sum(int n){
        if(n==0) return 0;
        return n+sum(n-1);

    }

    public static boolean sorted(int n[],int k){
        if(n[k]<n[k-1]){
            return false;
        }
        if(k==0) return true;
        sorted(n,k-1);
        return false;
        
    }

    public static void main(String[] args) {
        //int n= 10;
       // printDec(n);
        //printInc(n);

        //System.out.println(fact(n));
       // System.out.println(sum(n));

       // int[] arr = {1,2,3,4,5};
        //System.out.println(sorted(arr,arr.length-1));

        int[][] arr2 = 
        {{0,0,0},
        {1,1,0},
        {1,1,0}};
        int n = 0;
        int m = 0;
        int r = arr2.length-1;
        int c = arr2[0].length-1;



        System.out.println(ratMaze(arr2, m, n, r, c));

    }
    
}
