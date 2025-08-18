//Write a Java method reverseArray(int[] arr) that reverses the elements of the given array in place (without using another array).
import java.util.*;
class Methods07{
    public static void reverseArray(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println("The reversed array is::"+Arrays.toString(arr));
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int Number[]=new int[5];
        System.out.println("Enter the elements into the array");
        for(int i=0;i<Number.length;i++){
            Number[i]=sc.nextInt();
            
        }
        reverseArray(Number);
        
    }
}