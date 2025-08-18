// Sum of first N natural numbers
class recursion05{
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n + sum(n-1);
    }
    public static void main(String ags[]){
        System.out.println("sum::"+sum(5));
        
    }
}