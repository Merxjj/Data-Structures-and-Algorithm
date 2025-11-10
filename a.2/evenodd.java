import java.util.Scanner;



public class evenodd{

    public static void main(String args[]){
        System.out.println("Enter the numbers ");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i = 0 ;i<arr.length; i++){
            arr[i] = sc.nextInt();


        }
        int iseven = 0;
        int isodd = 0;
        for(int i = 0 ;i<arr.length;i++){
            if(arr[i]%2 == 0) iseven++;
                else isodd++;
        }

        System.out.println("even numbers are : "+iseven + "odd numbers are : "+ isodd);
        sc.close();
    }

    
}