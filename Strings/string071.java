//count the number of words in the array using split("\\s+")
class string071{
    public static void main(String args[]){
        String str="This is Naresh";
        String words[]=str.trim().split("\\s+");
        System.out.println("The Number of words in the string is ::"+words.length);
    }
}