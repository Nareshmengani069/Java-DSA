//Print numbers from 1 to N using recursion
class recursion03{
    public static void numbers(int n){
        if(n==0){
            return ;
        }
       numbers(n-1);
       System.out.println(n+"");
    }
    public static void main(String args[]){
        numbers(10);
        
    }
}