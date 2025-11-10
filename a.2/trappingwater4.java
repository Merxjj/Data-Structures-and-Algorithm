public class trappingwater4 {

    public static int trapping(int hieght[]){
        int[] leftMax = new int[hieght.length];
        int[] rightMax = new int[hieght.length];
        leftMax[0] = hieght[0];
        rightMax[hieght.length-1] = hieght[hieght.length - 1 ];
        int n = hieght.length;

        for(int i = 1;i< n;i++){
           leftMax[i] = Math.max(hieght[i],leftMax[i-1]);
        }
        for(int i= 0;i<n;i++){
            System.out.print(leftMax[i]);
        }

        System.out.println();
        for(int i = n-2;i>=0;i--){

           rightMax[i] = Math.max(hieght[i],rightMax[i+1]);


        }
        for(int i= 0;i<n;i++){
            System.out.print(rightMax[i]);
        }


        int width = 0;
        int trappedWater = 0;

        for(int i = 0;i<n;i++){
            width = Math.min(leftMax[i],rightMax[i]);
            trappedWater+= width - hieght[i];
        }
        
    
        //return trappedWater;
        System.out.println("trapped water area :  \n");
        return trappedWater;
}


public static void main(String[] args){
    System.out.println("Entered array is ");
    int hieght[] = {3,0,1,0,4,0,2};
    System.out.println(trapping(hieght));

}



    
}
