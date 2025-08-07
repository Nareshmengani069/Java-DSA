//Insertion sort
import java.util.Scanner;
class Arrayinsertionsort{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter the elements into the array");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
            
        }
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>current){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        System.out.println("The sorted array is ");
        for(int nums : arr){
            System.out.print(nums);
        }
        
    }
}