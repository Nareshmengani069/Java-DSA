// Method 2: In-place reversal (without extra array)
import java.util.Scanner;
class Arrayreversal{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter the elements into Array");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
            
            }
            System.out.println("The reversed Array is ");
            for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            }
    }
}