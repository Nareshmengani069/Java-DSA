//Reversing the array 
import java.util.Scanner;
class Arrayreversing{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr1[]=new int[5];
        System.out.println("Enter the elements into the Array1");
        for(int i=0;i<5;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Reversing the Elements of Array1");
        for(int i=arr1.length-1;i>=0;i--){
        
        System.out.println(arr1[i]);
        } 
    }
}