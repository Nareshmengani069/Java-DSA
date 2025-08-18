//Count number of words in a string.
class string07{
    public static void main(String args[]){
        String str="this is Naresh";
        int count=0;
        boolean inWord=false;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=(' ') &&  !inWord){
                count++;
                inWord=true;
            }
            else if(str.charAt(i)==' '){
                inWord=false;

            }
        }
        System.out.println(count);
    }
}