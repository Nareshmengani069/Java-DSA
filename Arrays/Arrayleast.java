
//Finding the least number in the Array
import java.util.Scanner;
class Arrayleast{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        
        System.out.println("Enter the Elements into the Array");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
            
        }
        int least=arr[0];
        for(int i=0;i<arr.length;i++){
            if(least>arr[i]){
                least =arr[i];
            }
        }
        System.out.println("The least number in the array is-:"+ least);
    }
}