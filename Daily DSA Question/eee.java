class eee {
    public static void main(String[] args) {
        int[] arr = {2,4,5,2,3,5,7};
        int[] temp = new int[arr.length];
        int[] temp2 = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            temp2[i] = arr[i];
        }
        for(int i = 0;i<arr.length;i++){
            temp[i] = arr[i];
        }
        
        for(int i = 0;i<arr.length-1;i++){
        if(temp[i]>temp[i+1]){
            temp[i+1]= temp[i];

         }
        }
        for(int i = arr.length-1;i>0;i--){
            if(temp2[i]>temp2[i-1]){
                temp2[i-1] = temp2[i];
            }
        }
        for(int i =0;i<temp2.length ;i++){
            System.out.print(temp2[i] + " ");
        }

        System.out.println();
        for(int i= 0;i<temp.length ;i++){
            System.out.print(temp[i]+ " ");
        }

        int water = 0;
        int currentWater = 0;
        int maxhieght = 0;
        for(int i= 1;i<arr.length-1;i++){
            maxhieght = Math.min(temp[i], temp2[i]);
            maxhieght = maxhieght - arr[i];
            if(maxhieght >=0){
                water += maxhieght;
            }
        }
        System.out.println();
        System.out.println(water + " is water capacity");
    }
}