//Reversing the array using another array
import java.util.Scanner;
class Arrayreversing1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr1[]=new int[5];
        int arr2[]=new int[5];
        System.out.println("Enter the elements into the Array1");
        for(int i=0;i<5;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Reversing the Elements of Array1");
        for(int i=0;i<5;i++){
            arr2[i]=arr1[4-i];
        
        System.out.println(arr2[i]);
        } 
    }
}