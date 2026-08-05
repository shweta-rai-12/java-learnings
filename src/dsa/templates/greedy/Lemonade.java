package dsa.templates.greedy;

public class Lemonade {

    /**
     * Lemonade problem : A queue of customers is waiting to buy lemonade. Each lemonade costs $5.
     * Each customer will only buy one lemonade and pay with either a $5, $10, or $20 bill.
     * You must provide the correct change to each customer so that the net transaction
     * @param arr -> The customers in the queue with the bill they have. 5,10,20
     * @return : The number of customers that can be served with the correct change. If a customer cannot be served, return 0.
     */
    public static int numberOfCust(int[] arr){
        int five = 0, ten = 0;
        int twenty = 0;
        int cust = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 5){
                five++;
                cust++;
            }else if(arr[i] == 10 & five>0){
                ten++;
                five--;
                cust++;
            }else if(arr[i] == 20){
                twenty++;
                if(ten > 0 && five > 0){
                    five--;
                    ten--;
                    cust++;
                }else if(five >= 3){
                    five = five -3;
                    cust++;
                }
            }
        }
        return cust;
    }

    public static void main(String[] args){
        int[] denomination = {5,5,5,10,10,20,10};
        System.out.println("The number of customers that can be served: "+numberOfCust(denomination));
    }
}
