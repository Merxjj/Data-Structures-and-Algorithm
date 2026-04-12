class Solution {
    public int reverse(int x) {
        
int remainder = 0,reversed = 0,num=x,negative = 0;
if(x==0) return 0;
if(x<0)
{
 negative = 1;
 num  = -(num);
}
while(num>0)
{
    remainder = num%10;
    if(reversed >Integer.MAX_VALUE/10||reversed<Integer.MIN_VALUE/10) 
    {return 0;}
    reversed = reversed*10+remainder;
    num/=10;
}

if(negative == 1)
{
    reversed = -(reversed);
}
return reversed;
    
}
}
