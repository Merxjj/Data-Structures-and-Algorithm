import java.util.*;

public class pattern1 {
    

    static void pattern(int n)
    {

        for(int i = 1;i<=n ;i++)
        {
            for(int j = 1;j<=n-i-1 ;j++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the number");
        int n = ob.nextInt();
        pattern(n);


    }


    
}
