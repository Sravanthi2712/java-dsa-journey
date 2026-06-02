/*
Problem: Sort012
Platform: LeetCode - 75
Topic: Array, two pointers
*/
import java.util.Scanner;

class Sort012{
    public static void sort_array(int[] nums){
        int n=nums.length;
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                high--;
            }
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
        sort_array(nums);
        System.out.println("Output matrix: ");
        for(int i=0;i<n;i++){
            System.out.println(nums[i]);
        }
    }
}