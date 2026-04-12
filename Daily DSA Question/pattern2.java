import java.util.*;

public class pattern2 {
    

    static void pattern(int n)
    {

        for(int i = 1;i<=n ;i++)
        {
            
           /*  //for printing proper spaces , not necessary 
            for(int j = 1;j<=n-i;j++)
            {
                System.out.print(" ");
            }*/
            // Print numbers in increasing order
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print numbers in decreasing order
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            
            System.out.println(" ");
        }
    }
static void print2(int n){
    for(int i=0;i<n;i++)
    {
        for(int j=n-i-1;j>=1;j--)
        {
            System.out.print(" ");
        }
        for(int j=0;j<2*i+1;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the number");
        int n = ob.nextInt();
        //pattern(n);
        print2(n);
        
        ob.close();
    }


    
}
