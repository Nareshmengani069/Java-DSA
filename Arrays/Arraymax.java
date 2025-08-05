//Finding the largest Number in the Array
import java.util.Scanner;
public class Arrraymax{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[]=new int [5];
        System.out.println("Enter the numbers into the array");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
            
        }
        int max=arr[0];
        for(int i=0;i<5;i++){
            if(max<arr[i] ){
                max=arr[i];
            }
        }
        System.out.println("The Largest number in the array is -:"+ max);
        
    }
}