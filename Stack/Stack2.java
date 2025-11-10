import java.util.Stack;
//1 push at bottom of stack
//2 reverseString
//3 reverse a Stack
//4 stock span problem

public class Stack2 {

//push at bottom
    static void pushAtBottom(Stack<Integer> s,int data){

        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        
        pushAtBottom(s, data);
        s.push(top);



    }

//2
//reverse a string using stack
    static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;

        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder st = new StringBuilder();
        while(!s.isEmpty()){
            st.append(s.pop());
        }

        return st.toString();



    }

    //3 reverse Stack
    static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        
        reverseStack(s);
        

        pushAtBottom(s, top);



    }
    
    static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
        
    }

    //4 stock span problem
    static void stockSpan(int[] stocks , int[] span){
        Stack<Integer> s = new Stack<>();
        s.push(0);
        span[0] = 1;


        for(int i = 1;i<stocks.length;i++){
            int currPrice = stocks[i];

           

            while(!s.isEmpty() && currPrice>=stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i +1;
                
            }else{
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }
        System.out.println();
        for(int i = 0;i<span.length;i++){
            System.out.print
            (span[i]);
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s  = new Stack<>();  //1
    
        s.push(1);
        s.push(2);
        s.push(3);
        int data = 4;
        pushAtBottom(s,data);

        while(!s.isEmpty()){
            System.out.println(s.pop());
         
        }
        
        //2
        String str = "abc";
        System.out.println(reverseString(str));

        //3
        Stack<Integer> s2 = new Stack<>();
        s2.push(1);
        s2.push(2);
        s2.push(3);
        s2.push(4);
        printStack(s2);
        reverseStack(s2);
        printStack(s2);
        //4
        //stock span problem        span = no. of consecutive previous day price<= todays price
        int stocks[] = {100,80,60,70,85,100};
        for(int i = 0;i<stocks.length;i++){
            System.out.println(stocks[i]);
        }
        int span[] = new int[stocks.length];
        for(int i = 0;i<span.length;i++){
            System.out.print(span[i]);
        }
        stockSpan(stocks, span);
    }    


}
