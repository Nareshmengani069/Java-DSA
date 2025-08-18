//Write a Java method findMax(int[] arr) that returns the largest element in the array.
import java.util.*;
class Methods05{
    public static int findmax(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int Number[]=new int[5];
        System.out.println("Enter the elements into the array");
        for(int i=0;i<Number.length;i++){
            Number[i]=sc.nextInt();
        }
        int nums=findmax(Number);
        System.out.println("the maximum number is "+nums);
    }
}