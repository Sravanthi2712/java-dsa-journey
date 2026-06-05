


import java.util.*;

class MajorityElement1{
    public static int majority_element(int[] nums){
        int n=nums.length;
        int res=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i,0)+1);
            if(map.get(i)>=n/2){
                res=i;
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res=majority_element(arr);
        System.out.println(res);
    }
}