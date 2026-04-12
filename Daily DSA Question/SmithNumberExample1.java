/* import java.util.*;  
public class SmithNumberExample1  
{  
    static int findSumPrimeFactors(int n)  
    {  
        int i = 2, sum = 0;  
        while(n > 1)  
        {  
            if(n % i == 0)  
            {  
                sum = sum + findSumOfDigit(i);  
                n = n / i;  
            }  
            else  
            {  
                do  
                {  
                    i++;  
                }  
                while(!isPrime(i));  
            }  
        }  
        return sum;  
    }  

    static int findSumOfDigit(int n)  
    {  
        int s = 0;  
        while(n > 0)  
        {  
            s = s + n % 10;  
            n = n / 10;  
        }  
        return s;  
    }  

    static boolean isPrime(int k)  
    {  
        boolean b = true;  
        int d = 2;  
        while(d < Math.sqrt(k))  
        {  
            if(k % d == 0)  
            {  
                b = false;  
            }  
            d++;  
        }  
        return b;  
    }  

    public static void main(String args[])  
    {  
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter a number: ");  

        int n = sc.nextInt();  

        int a = findSumOfDigit(n);  
        int b = findSumPrimeFactors(n);  

        System.out.println("Sum of Digits of the given number is = " + a);  
        System.out.println("Sum of digits of its prime factors is = " + b);  

        if(a == b)  
            System.out.print("The given number is a smith number.");  
        else  
            System.out.print("The given number is not a smith number.");  
    }  
}  
*/

//A Smith number is a composite number, whose sum of the digits is equal to the sum of its prime factors.
//for example 4,22,27,58,85,94,121,,,,,,,.... are Smith numbers
//Sample input : 666
//sum of the digits : 6+6+6 = 18
//Prime factors are 2,3,3,37
//Sum of digits of the prime factors: 2+3+3+(3+7)=18
//thus 666 is a prime number
import java.util.*;

class SmithNumberExample1{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the number");
        int n = ob.nextInt();
        int num, sod=0,sopf=0,t;
        num = n;
        
        //get sum of digits of the number
        while(num>0)

        {
            t = num%10;
            sod += t;
            num = num/10;
        }
        for(int i = 2;i<=n;i++)
        {
            if(n%i==0)
            {
                t = i;
                while(t>0)
                {
                    sopf+= t%10;
                    t = t/10;
                }

                n = n/i;
                i--;
            }
        }

        if(sopf == sod)
        {
            System.out.println("smith number");
        }
        else{
            System.out.println("not a smith number");
        }
        ob.close();
    }
    
}