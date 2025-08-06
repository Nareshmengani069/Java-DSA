//Prints how many numbers are positive, negative, and zero
import java.util.Scanner;
class Arraycounting{
    public  static void main(String args[]){
        Scanner  sc=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("Enter the elements into the array");
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
            }
            int positive=0;
            int negative=0;
            int zero=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>0){
                    positive++;
                }else if(arr[i]<0){
                    negative++;
                }else{
                    zero++;
                }          
                }
                System.out.println("The no. of positive Numbers are"+ positive );
                System.out.println("The no. of  negative Numbers are"+ negative );
                System.out.println("The no. of Zeros are"+ zero  );
    }
}