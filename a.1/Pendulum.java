import java.util.Scanner;

public class pendulum{
    static void plusmethod(int x, int y)
    {
        System.out.println("addition is " + (x+y));
    }
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the  numbers in array");
        int size  = 5;
       /*/ int y = scanner.nextInt();
        int t = y;


        int[] arr = new int[5];
        int n= 5;
        while(t>0){
            int remainder = t%10;
            arr[n-1] = remainder;
            t = t/10;
            n--;
        }

        n=5;
        for(int i = 0;i<(5/2) ;i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }

        for(int i = 0; i<5 ;i++){
            System.out.print(arr[i]);
        }*/



        for(int i = 0; i<size ;i++){
            arr[i] = scanner.nextInt();


        }

        for(int i = 0;i<size ;i++){
            
        }

        scanner.close();



    }


}