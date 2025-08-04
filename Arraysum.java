
//sum of All the Elements in the Array
import java.util.Scanner;
class Arraysum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter the Elements into the array ");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
            
        }
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum= sum+arr[i];
        }
        System.out.println("The sum of  all the emelemts in the array is -:"+ sum);
        
    }
    
    
}