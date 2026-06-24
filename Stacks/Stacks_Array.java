import java.util.*;
public class Stacks_Array{
    int size=20;
    int[] arr=new int[20];
    int top=-1;

    public void push(int ele){
        if(top>=size-1){
            System.out.println("Stack Full OverFlow");
        }
        else{
            arr[++top]=ele;
        }
    }
    
    public int pop(){
        int del=0;
        if(top==-1){
            System.out.println("Stack UnderFlow");
        }
        else{
            del=arr[top];
            top--;
        }
        return del;
    }

    public int peek(){
        int res=0;
        if(top==-1){
            System.out.println("No Element");
        }
        else{
            res=arr[top];
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stacks_Array st=new Stacks_Array();
        int choice;
        do { 
            System.out.println("1.Push Element");
            System.out.println("2.Pop Element");
            System.out.println("3.Top Element");
            System.out.println("4.Exit");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    int ele=sc.nextInt();
                    st.push(ele);
                    System.out.println(ele+" pushed");
                    break;
                case 2:
                    int del=st.pop();
                    System.out.println(del+" deleted");
                    break;
                case 3:
                    int res=st.peek();
                    System.out.println("Top Element:"+res);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }while (choice!=4);
    }
}
