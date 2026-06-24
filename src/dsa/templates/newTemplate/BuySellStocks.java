package dsa.templates.newTemplate;

public class BuySellStocks {

    public static int buySell(int[] arr){
        if(arr == null || arr.length == 0)
            return 0;
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<arr.length;i++){
            min = Math.min(min,arr[i]);
            maxProfit = Math.max(maxProfit,arr[i]-min);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,7,1,3,2,9};
        System.out.println("Max profit is : "+ buySell(arr));
    }
}
