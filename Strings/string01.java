//Common String methods
class string01{
    public static void main(String args[]){
        String s1="this is Naresh";
        String s2="this is Naresh";
        System.out.println(s1.length());
        System.out.println(s1.charAt(5));
        System.out.println(s1.substring(8));
        System.out.println(s1.substring(0,7));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.trim());
        System.out.println(s1.contains("this"));
    }
}