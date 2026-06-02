
import java.util.Scanner;

/*
Problem: Set Matrix Zeroes
Platform: LeetCode - 73
Topic: Arrays, Matrix
*/
//Approach 1---O(m*n),O(1)
class SetMatrixZeroes{
    public static void setZeroes(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        boolean firstRowZero=false;
        boolean firstColZero=false;
        for(int i=0;i<rows;i++){
            if(matrix[i][0]==0){
                firstColZero=true;
                break;
            }
        }
        for(int j=0;j<cols;j++){
            if(matrix[0][j]==0){
                firstRowZero=true;
                break;
            }
        }
        for(int i=1;i<rows;i++){
            for(int j=1;j<cols;j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
        for(int i=1;i<rows;i++){
            for(int j=1;j<cols;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(firstRowZero){
            for(int i=0;i<cols;i++){
                matrix[0][i]=0;
            }
        }
        if(firstColZero){
            for(int j=0;j<rows;j++){
                matrix[j][0]=0;
            }
        }
    }

    public static void main(String[] args) {
        int rows=0,cols=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        rows=sc.nextInt();
        System.out.println("Enter no. of cols:");
        cols=sc.nextInt();
        int[][] matrix=new int[rows][cols];
        System.out.println("Enter matrix: \n");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Given matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.print("\n");
        }
        setZeroes(matrix);
        System.out.println("Output matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}

/*
Approach 2---O(m*n*(m+n)),O(1)
class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    for(int row=0;row<n;row++){
                        if(matrix[row][j]!=0){
                            matrix[row][j]=-1;
                        }
                    }
                    for(int col=0;col<m;col++){
                        if(matrix[i][col]!=0){
                            matrix[i][col]=-1;
                        }
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
*/