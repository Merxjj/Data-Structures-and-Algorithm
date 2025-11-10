import java.util.*;
public class a1functions {

   //decimal to binary conversion  
    public static int dtob(int n){
        int pow = 0;
        int binary = 0;
        while (n >0){
            int rem = n%2;
            //math class return float value so we have to typecast it in int ;
            binary  = binary + rem*((int)Math.pow(10,pow));
            pow++;
            n/=2;

        }
        return binary;
    }

    //factorial 
    public static int fact(int n){
        int fact = 1;
        for(int i = 1;i<=n;i++){
            fact *= i ;

        }
        return fact;
    }
    //binomail coefficient  = nCr
    public static int nCr(int n, int r){
        int nfact = fact(n);
        int nmrfact = fact(n-r);
        int rfact = fact(r);
        return nfact/(nmrfact * rfact);
    }  

    //public static int nCr
    public static void main(String[] args) {
        int dec = 10;
        System.out.println("binary of decimal number : "+dec+" is : ");
        System.out.println(dtob(dec));
        System.out.println("factorial of "+dec+" is "+fact(dec));
        
        int n = 4; 
        int r = 5;
        System.out.println("Binomial coefficient of "+n+"C"+r+ " = "+nCr(n,r));
    }
}
