//Take a 2D array (m × n) from the user and print it in matrix format.
import java.util.*;
class twodarray01{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows");
        int r=sc.nextInt();
        System.out.println("Enter col");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter the values into the array");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
                
            }
        }
         System.out.println("the matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
        
        System.out.print(arr[i][j]+"  ");
    }
    System.out.println();
        }
    }
}