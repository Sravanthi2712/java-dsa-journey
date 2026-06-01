/*
Problem: Pascal Triangle
Platform: LeetCode
Topic: Dynamic Arrays -- List
*/

import java.util.*;
class PascalTriangle{
    public static List<List<Integer>> add_pascal_trainagle(int numRows){
        List<List<Integer>>triangle=new ArrayList<>();
        List<Integer>firstRow=new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        for(int i=1;i<numRows;i++){
            List<Integer>row=new ArrayList<>();
            row.add(1);
            List<Integer>prev=triangle.get(i-1);
            for(int j=1;j<prev.size();j++){
                row.add(prev.get(j-1)+prev.get(j));
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }
    public static void main(String[] args) {
        int rows=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of rows:");
        rows=sc.nextInt();
        List<List<Integer>>triangle=new ArrayList<>();
        triangle=add_pascal_trainagle(rows);
        for(int i=0;i<triangle.size();i++){
            System.out.print(triangle.get(i));
        }
    }
}