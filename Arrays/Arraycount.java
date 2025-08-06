//counting the occurence of number in array
import java.util.Scanner;
class Arraycount{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter the Elements into array");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
            
        }
        System.out.println("Enter the target");
        int target=sc.nextInt();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count+=1;
            }
        }
        System.out.println("The target occurs" +count+ "times");
    }
}