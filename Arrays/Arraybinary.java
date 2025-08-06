// Binary Search (Iterative)
import java.util.Scanner;
class Arraybinary{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter the sorted numbers into the array");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("Enter the target");
        int target=sc.nextInt();
        int start=0;
        int end=arr.length;
        boolean found=false;
        
        while(start<=end){
            int mid=(start+end)/2;
            if(target==arr[mid]){
                System.out.println(target + "found at index"+mid);
                found=true;
                break;
            }else if  (target<arr[mid]){
                end=mid-1;
            }else if (target>arr[mid]){
                start=mid+1;
            }
        }
        if(!found){
            System.out.println("The target is not founnd in the array");
        }

    }
}