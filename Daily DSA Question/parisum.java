import java.util.*;

public class parisum {




    public static boolean brutepairsum(ArrayList<Integer> list, int target){
        for(int i = 0;i<list.size();i++){
            for(int j = i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)== target){

                    System.out.println(i+" "+j);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean optimizedpairsum(ArrayList<Integer> list, int target){
       int i = 0;
       int j = list.size()-1;
       while(i<j){
        if(list.get(i)+list.get(j)== target){
            System.out.println(i + " " + j);
            return true ;

        }else if(list.get(i)+list.get(j)<target){
            i++;
        }else{
            j++;
        }
       }
        return false;
    }


// when array is sorted and rotated   then use this 
    public static boolean optimizedpairsum2(ArrayList<Integer> list, int target){

        int startElement = 0;
        for(int i = 0;i < list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                startElement = i+1;
                break;
            }
        }
        int i = startElement;
        int j = startElement-1;

        while(i!=j){
            int sum = list.get(i)+list.get(j);
            if(sum == target ){
                System.out.println("target reached " + list.get(i) + " " + list.get(j));
                return true ;

            }else if(sum <target){
                i++ ;
                if(i==list.size()){
                    i = 0;
                }
            }else{
                j--;
                if(j== -1){
                    j = list.size()-1;
                }
            }
        }
      
         return false;
     }
 



    



    public static void main(String[] args) {
      /*   ArrayList<Integer> list = new ArrayList<>();
        int target = 4;
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(9);
        System.out.println(brutepairsum(list, target));



        System.out.println("optimized");
        System.out.println(optimizedpairsum(list, target));*/


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        int target = 5;
        optimizedpairsum2(list2, target);
    }
    
}
