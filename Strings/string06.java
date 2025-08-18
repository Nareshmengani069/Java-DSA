//Reverse a string without using built-in functions (like reverse() of StringBuilder or Collections).
class string06{
    public static void reversing(String str){
        
       
        char chars[]=str.toCharArray();
         int end =chars.length-1;
         int start=0;
         while(start<end){
            char temp = chars[start];
            chars[start]=chars[end];
            chars[end]=temp;
            start++;
            end--;
         }
         String reversed=new String(chars);
         System.out.println("the reversed string is ::"+ reversed);

        }
    
    public static void main(String args[]){
        String input="Naresh";
        
        reversing(input);
        

    }
}