package Week_1.Day_1;

public class best_Time_sell_buyStock {
    public static void main(String[] args) {
        int[]price={7,1,5,3,6,4};
        System.out.println(besttimesellbuystock(price));;
    }
    static int besttimesellbuystock(int[]price){
        int profit=0;
        int minprice=price[0];

        for(int i=1;i<price.length;i++){
            if(price[i]<minprice){
                minprice=price[i];
            }
            profit=Math.max(profit,price[i]-minprice);}
        return profit;
    }
}
