public class Q {

    public static class Que{
        int rear;
        int size;
        int arr[];

        Que(int n){
            arr = new int[n];
            rear = -1;
            size = arr.length;
        }

        boolean isEmpty(){
            return rear == -1;
        }
        void enQue(int data){
            if(rear == size-1){
                System.out.println("Queue is Full");

            }else{
                rear++;
                arr[rear] = data;

            }

        }
        int deQue(){
            if(rear == -1){
                System.out.println("Queue is Empty");
                return -1;
            }
            int front = arr[0];
            for(int i = 0;i < arr.length-1 ;i++){
                arr[i] = arr[i+1];
            }
            rear = rear -1;
            return front;
            
        }

        int peek(){
            if(isEmpty()) return -1;
            return arr[0];
        }


     }
     public static void main(String[] args) {
        Que q = new Que(5);
        q.enQue(3);
        q.enQue(5);
        q.enQue(6);
        q.enQue(7);
        q.enQue(8);
        while(!q.isEmpty()){
            System.out.println(q.deQue());
        }
        

     }
    
}
