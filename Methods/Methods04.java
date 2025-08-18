//Check if number is even → boolean isEven(int num)
class Methods04{
    public static boolean isEven(int num){
    return num%2==0;
    }
    
    public static void main(String args[]){
        int Number=10;
        if(isEven(Number)){
            System.out.println("The number is even");
        }else{
        System.out.println("The  number is odd");
        }
        
        
    }
}