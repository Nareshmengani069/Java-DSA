//Sum of digits of a number
class whilesum{
    public static void main(String args[]){
        int n=12345;
        int sum=0;
        while(n>0){
            sum+=n%10;
            n=n/10;
            
        }
        System.out.println("The sum of the digits of number is --:"+sum);
    }
}