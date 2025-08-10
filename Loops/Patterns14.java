//sandglass star pattern
class Patterns14{
    public static void main(String args[]){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
                
            }
            for(int k=i;k<n;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i-1);j++){
                System.out.print(" ");
            }
            for(int k=0;k<(1*i+1);k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}