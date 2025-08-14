//Transpose of a Matrix Convert rows into columns (and vice versa).
class twodarray05{
    public static void main(String args[]){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int transpose[][]=new int[arr[0].length][arr.length];
        for(int i=0;i<arr[0].length;i++){
            for(int j=0;j<arr.length;j++){
                transpose[i][j]=arr[j][i];
            }
        }
        for(int[] num:transpose){
            for(int n:num){
                System.out.print(n+"  ");
            }
            System.out.println();
        }
        
    }
}