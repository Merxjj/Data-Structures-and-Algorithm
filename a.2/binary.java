public class binary {

    public static int binarysearch(int arr[], int target){
        int low = 0;
        int high =  arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                low = mid+1;

            }else{
                high = mid-1;
            }

            }
            return-1;
        }


    

    public static void main(String[] args) {
        int[]arr={2,4,6,8,10,33};
        int target = 10;
        int result = binarysearch(arr,target);
        if(result!= -1){
            System.out.println("element found at index "+ result);
        }else{
            System.out.println("element not found");
        }
        
    }
}
    

