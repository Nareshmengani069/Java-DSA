//print first and last charecters of the string
import java.util.Scanner;
class string02{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the input String");
        String s1=sc.nextLine();
        System.out.println("The first charecter is :: " + (s1.charAt(0))+"  The last charecter is :: "+(s1.charAt(s1.length()-1)));
        
    }
}