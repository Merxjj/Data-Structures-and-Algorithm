import java.util.*;



public class MOstwater {



    public static int bruteMostWAter(ArrayList<Integer> list){

        int maxWater = 0;
        for(int i = 0;i<list.size();i++){
            for(int j= i+1;j<list.size();j++){
                int height = Math.min(list.get(i), list.get(j));
                int width = j-i;
                int currWater = width * height;
                maxWater = Math.max(maxWater, currWater);
            }
        }

        return maxWater;


    }

    public static int optimizedMostWAter(ArrayList<Integer> list){

        int maxWater = 0;
        int i = 0;
        int j= list.size()-1;

      while(i<j){

        int height = Math.min(list.get(i),list.get(j));
        int width = j-i;
        int currWater = width*height;
        maxWater = Math.max(maxWater, currWater);
        if(list.get(i)<list.get(j)){
            i++;
        }else{
            j--;
        }

      }

        return maxWater;


    }


    

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(8);
        list.add(6);
        list.add(3);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);


        System.out.println(bruteMostWAter(list));

        System.out.println(optimizedMostWAter(list));

        
    }
    
}
