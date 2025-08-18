//: Nth Fibonacci number
class recursion07{
    public static int fibinoci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fibinoci(n-1)+fibinoci(n-2);
    }
    public static void main(String args[]){
        System.out.println(fibinoci(6));
        
    }
}