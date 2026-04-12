public class bubble {

    public static void bubbleSort(int arr[]){


        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                }
            }
        }
        
        for(int i  = 0;i<arr.length ;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    
    public static void main(String[] args) {
        int arr[]  = {1,3,5,2,2,2,6666,6,5,4};
        bubbleSort(arr);
    }
    
}
