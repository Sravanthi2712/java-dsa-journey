/*
Problem: Stock And Buy
Platform: LeetCode - 121
Topic: Arrays
*/
import java.util.*;
class StockAndBuy1{
    public static int max_profit(int[] profits){
        int min=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<profits.length;i++){
            if(profits[i]<min){
                min=profits[i];
            }
            else{
                maxprofit=Math.max(maxprofit,profits[i]-min);
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        int n=sc.nextInt();
        System.out.println("Enter elements:");
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int res=max_profit(nums);
        System.out.println("max profit:"+res);
    }
}