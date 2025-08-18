//Count vowels and consonants in a string
import java.util.Scanner;
class string04{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int vowels=0;
        int consonents=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)>='a' && s1.charAt(i)<='z'){
            if (s1.charAt(i)=='a' || s1.charAt(i)=='e' ||s1.charAt(i)=='i' ||s1.charAt(i)=='o' || s1.charAt(i)=='u' ){
                vowels+=1;
            }else {
                consonents+=1;
            }
            
        }
        }
         System.out.println("The number of vowels are ::"+vowels);
        System.out.println("The number of consonents are ::"+consonents);
    }
}