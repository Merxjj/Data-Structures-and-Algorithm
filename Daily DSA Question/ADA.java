public class ADA {

    public static void minMax(int arr[],int low , int high){
        int sorted  =  1;
        for(int i = 1 ;i<arr.length ;i++){
            if(arr[i]>arr[i-1])
            {
                continue;
            }else{
                sorted = -1;
            }
        }

        if (sorted ==1 ){
            int min = arr[0];
            int max = arr[arr.length-1];
            System.out.println("max element is "+max + " min : "+ min);
        }
        else{
            dncminMax(arr,low,high,)
        }



    }

    public static void mergeSort(int arr[], int low , int high ){
        if(low >= high ) return ;

        int mid = low + (high - low )/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low , mid , high );
        
    }
    public static void merge(int[] arr, int low , int mid , int high){
        int[] temp = new int[high - low + 1];
        int i = low ;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j<= high){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            }else{
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            temp[k++]  = arr[i++];
        }
        while(j<=high){
            temp[k++]= arr[j++];
        }
        for( k = 0,i = low ;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
        
    }
   
    
    public static void main(String args[]){

    int[] arr = {1,2,4,4,5,7};
    int low = 0;
    int high = arr.length -1;
    //minMax(arr,low,high);\

    mergeSort(arr, low, high);
    for(int i = 0 ;i<arr.length ;i++){
        System.out.print(arr[i]);
    }


    }
    

}