//Diamond pattern of stars
class Patterns12{
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=0;j<(n-i);j++){
                System.out.print(" ");
            }
            for(int k=0;k<(2*i-1);k++){
                System.out.print("*");
            }
            
            System.out.println();
            
        }
        for(int i=4;i>0;i--){
            for(int j=0;j<(n-i);j++){
                System.out.print(" ");
            }
            for(int k=0;k<(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}