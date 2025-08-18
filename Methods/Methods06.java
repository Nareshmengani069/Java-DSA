//Write a Java method countEven(int[] arr) that returns the count of even numbers in the given array.
import  java.util.Scanner;
class Methods06{
    public static int counteven(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count+=1;
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int Number[]=new int[5];
        System.out.println("Enter the elements into the array");
        for(int i=0;i<5;i++){
            Number[i]=sc.nextInt();
            
        }
        int nums=counteven(Number);
        System.out.println("The even numbers are::"+nums);
        
    }
}