//Find sum of both diagonals.
class twodarray08{
    public static void main(String args[]){
      int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
      int primary=0;
      int secondary=0;
     for(int i=0;i<arr.length;i++){
         for(int j=0;j<arr[i].length;j++){
             if(i==j){
                 primary+=arr[i][j];
             }
             if(i+j==arr.length-1){
                 secondary+=arr[i][j];
             }
         }
     }
     System.out.println("The sum of primary diagonal is ::"+primary);
     System.out.println("The sum of secondary diagonal is ::"+secondary);
    }
}