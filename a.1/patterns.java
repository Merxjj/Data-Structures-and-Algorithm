import java.util.*;



public class patterns {



    static void pattern11(int n)
{
    int start  =1 ;
    for(int i =0;i<n;i++)
    {
        if(i%2==0) start = 1;
        else start = 0;
        for(int j=0;j<=i;j++)
        {
            System.out.print(start);
            start = 1-start;
        }
        
    System.out.println();
        
    }
}
//crown pattern
static void pattern12(int n)
{
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<=i;j++)
        {
            System.out.print(j+1);
        }
        for(int j=0;j<2*n-2*i-2;j++)
        {
            System.out.print(" ");
        }
        for(int j=i+1;j>=1;j--)
        {
            System.out.print(j);
        }
       
        System.out.println();
    }
}
static void pattern15(int n)
{
       // Write your code here
       for(int i=0;i<n;i++)
       {
           for(char ch='A';ch<=ch+(n-i-1);ch++)
           {
               System.out.print(ch+" ");
           }
           System.out.println();
       }

   }



//alpharamp
static void pattern16(int n)
{
    char ch = 'A';
        for(int i=0;i<n;i++)
        {  
            for(int j=0;j<=i;j++)
            {
                System.out.print(ch+" ");
              
            }
             
            System.out.println();
            ch++;
        }
}
    //alphahill
public static void pattern17(int n) {
    // Write your code here
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n-i-1;j++)
        {
            System.out.print(" ");
        }
        for(char ch ='A';ch<='A'+i;ch++)
        {
            System.out.print(ch+" ");
        }
        for(char ch =(char) ('A'+i-1);ch>='A';ch--)
        {
            System.out.print(ch+" ");
        }
        System.out.println();
    }
}


public static void pattern18(int n) {
    // Write your code here
    for(int i=0;i<n;i++)
    {
        for(char ch=(char)('A'+n-1);ch>='A'+n-i-1;ch--)
        {
            System.out.print(ch+" ");
        }
        System.out.println();
    }
}

public static void pattern19(int n)
{
  /*   for(int i=0;i<n;i++)
    {
        for(int j=0;j<n-i;j++)
        {
            System.out.print("*");
        }
        for(int j=0;j<2*i;j++)
        {
            System.out.print("^");
        }
        for(int j=0;j<n-i;j++)
        {
            System.out.print("*");
        }
        
        System.out.println();
    }

    for(int i=0;i<n;i++)
    {
        for(int j=0;j<=i;j++)
        {
            System.out.print("*");
        }
        for(int j=0;j<2*n-2*i-2;j++)
        {
            System.out.print("^");
        }
        for(int j=0;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
        */
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<2*i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
          
        }
        for(int i=0;i<n;i++)
        {
              for(int j=0;j<=i;j++)
            {
                System.out.print("*");

            }
            for(int j=0;j<2*n-2*i-2;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
}

public static void pattern20(int n)
{
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<=i;j++)
        {
            System.out.print("*");
        }
        for(int j=0;j<2*n-2*i-2;j++)
        {   
            System.out.print("^");
            

        }
        for(int j=0;j<=i;j++)
        {
            System.out.print("*");

        }
        System.out.println();
    }
    for(int i=0;i<n-1;i++)
    {
        for(int j=0;j<n-i-1;j++)
        {
            System.out.print("*");
        }
        for(int j=0;j<2*i+2;j++)//5
        {
            
            System.out.print("^");
        }
        for(int j=0;j<n-i-1;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    
    

}


static void pattern21(int n)
{
   for(int i=0;i<n;i++)
   {
        for(int j=0;j<n;j++)
        {
            if((i==0)||(j==0)||(i==n-1)||(j==n-1))
            {
                System.out.print("*");
            }
            else
            {
                System.out.print("^");
            }

        }
        System.out.println();
   }
}
static void printGfg(int N) {
        
    while(N>0)
    {
        System.out.print("GFG ");
        printGfg(N-1);
    }
    return;
    // code here
}
    public static void main(String[] args)
    {
        //Scanner ob = new Scanner(System.in);
        //System.out.println("enter the number to get triangle");

        //int n = ob.nextInt();
        int n = 5;
        //pattern11(n);
        //pattern12(n);
        //pattern15(n);
       
        //pattern16(n);
        //pattern17(n);
        //pattern18(n);
        //pattern19(n);
        //pattern20(n);
        //pattern21(n);
          printGfg(n);
     //ob.close();
    }
        
    }

