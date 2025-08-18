//Find maximum number in the array using methods
import  java.util.*;
class Methods01{
    public static int findmax(int[] arr){
        int max=arr[0];
        for(int num : arr){
            if(num>max){
                max=num;
            }
        }
        return max;
        
    }
    public static void  main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] Numbers=new int[5];
        System.out.println("Enter the elements into the array");
        for(int i=0;i<Numbers.length;i++){
            Numbers[i]=sc.nextInt();
        }
        int maxvalue=findmax(Numbers);
        System.out.println("The maximun numbers is ::"+maxvalue);
            
        
        
    }
}

 