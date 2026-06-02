/*
Problem: Kadane Algorithm
Platform: LeetCode -53
Topic: Arrays
*/
import java.util.*;
class KadaneAlgorithm{
    public static void max_subarray_sum(int[] nums){
        int n=nums.length;
        int currsum=0,max=Integer.MIN_VALUE;
        int  tempstart=0;
        int start=-1,end=-1;
        for(int i=0;i<n;i++){
            if(currsum<=0){
                currsum=nums[i];
                tempstart=i;
            }
            else{
                currsum+=nums[i];
            }
            if(currsum>max){
                max=currsum;
                start=tempstart;
                end=i;
            }
        }
        System.out.println("max subarray sum:"+max);
        for(int i=start;i<=end;i++){
            System.out.print(nums[i]+" ");
        }
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
        max_subarray_sum(nums);
    }
}

/*
import java.util.Scanner;
class KadaneAlgorithm{
    public static int max_subarray_sum(int[] nums){
        int n=nums.length;
        int currsum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            currsum=Math.max(nums[i],currsum+nums[i]);
            max=Math.max(currsum,max);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int res=max_subarray_sum(nums);
        System.out.println("Max Subarray sum:"+res);
    }
}
*/