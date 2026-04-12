import java.util.*;
public class buyandsellstock {

    public static int price(int price[]){
        int maxProfit = 0 ;
        int buyPrice = Integer.MAX_VALUE;
        int profit ;
        for(int i = 0;i<price.length;i++){

            if(buyPrice>price[i]){
                buyPrice = price[i];
            }
            profit = price[i]-buyPrice;
            maxProfit = Math.max(maxProfit, profit);

        }
        return maxProfit;

    }

    public static void main(String[] args) {
        System.out.println("Enter the price of stock as per day ");
        int[] price = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<5 ;i++){
            price[i] = sc.nextInt();

        }
        System.out.println(price(price));
        sc.close();
    }
    
}
