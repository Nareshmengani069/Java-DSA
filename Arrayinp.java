import java.util.Scanner;
public class Arrrayinp{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[]=new int [5];
        System.out.println("Enter the numbers into the array");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The Elements the array are ");
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
        
    }
}