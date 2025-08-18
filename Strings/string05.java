//Check if a string is a palindrome
import java.util.Scanner;
class string05{
    public static boolean isPalindrome(String str){
        int start=0;
        int end=str.length()-1;
        while(start<end){
            if(str.charAt(start)!=(str.charAt(end))){
                return false;
            }
            start++;
            end--;

        }
        return true;
    }
    public static void main(String args[]){
        System.out.println("Enter the input String");
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine().toLowerCase();
        if(isPalindrome(s1)){
            System.out.println("The given String is palindrome");
        }else{
        System.out.println("The given string is NOT palindrome");
        }
        
            
        


    }
}