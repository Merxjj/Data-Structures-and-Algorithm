/* Write a Program in Java to input a number and check whether it is a Disarium Number or not.
Note: A number will be called DISARIUM if sum of its digits powered with their respective position is equal to the original number.
For example 135 is a DISARIUM
(Workings 11+32+53 = 135, some other DISARIUM are 89, 175, 518 etc) */




import java.util.Scanner;

public class disarium {

    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the number");
        int n = ob.nextInt();
        int num = n;
        int c= 0,s=0,r=0;

        while(num>0)
        {
            num = num/10;
            c++;
        }
        num = n;
        while(num >0)
        {   r = num%10;
            s = s + (int)Math.pow(r, c--);
            num = num/10;
        }
        if(s == n)
        {
            System.out.println("Disarium");

        }
        else
        {
            System.out.println("not a disarium no.");
        }
        ob.close();
    }
}
