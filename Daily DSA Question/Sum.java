import java.util.Scanner;

public class Sum {
    static void plusmethod(int x, int y)
    {
        System.out.println("addition is " + (x+y));
    }
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the numbers");
        int x= scanner.nextInt();
        int y = scanner.nextInt();
        plusmethod(x,y);
        int z = 58;
        System.out.println(z);
    }
}
