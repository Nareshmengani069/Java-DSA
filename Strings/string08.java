//Write a program to find the first non-repeating character in a string.
class string08{
    public static void main(String args[]){
        String str="aabbcbd";
        boolean found= false;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            boolean repeating=false;
            for(int j=0;j<str.length();j++){
                if(i != j && ch==str.charAt(j)){
                    repeating = true;
                    break;
                }
            }
            if (!repeating){
                System.out.println("The non-repeating character is ::"+ ch);
                found=true;
            break;
            }
        }
        if(!found){
            System.out.println("The NON repeating character is not found!");
        }
    }
}