
import java.util.*;

public class stacks {
// to find next greater element on right side    
    public static void nxtGreater(int[] arr){
        Stack<Integer> s = new Stack<>();
       
        int[] nxtGreater = new int[arr.length];
        
        for(int i = arr.length-1;i>=0;i--){
            while(!s.isEmpty()&& arr[s.peek()]<= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nxtGreater[i] = -1;
            }else{
                nxtGreater[i] = arr[s.peek()];
            }
            s.push(i);
            
            
        }
        
        for(int i = 0;i<nxtGreater.length;i++){
            System.out.println(nxtGreater[i]+ " ");
        }
        
    }



    // stock span problem
    //  
    public static void stockSpan(int arr[]){
        Stack<Integer> s = new Stack<>();
        int[] span = new int[arr.length];

        for(int i = 0;i<arr.length;i++){
            int currPrice = arr[i];
            while(!s.isEmpty()&& currPrice>arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;

            }else{
                int prevHigh = s.peek();
                span[i] = i - prevHigh;

            }
            s.push(i);
        }

        for(int i= 0;i<arr.length;i++){
            System.out.print(span[i]+ " ");
        }

    }
    public static void main(String[] args) {
        int[] arr = {6,8,0,1,3};
        nxtGreater(arr);
        System.out.println("Stock span problem");

        int[] arr2 = {100,80,60,70,60,85,100};
        stockSpan(arr2);
        
      

    }
    
}
