//Print numbers from N to 1 using recursion
class recursion04{
    public static void printnto1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printnto1(n-1);
    }
    public static void main(String args[]){
        printnto1(10);
        
    }
}