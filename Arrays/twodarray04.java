//Print the sum of each column.
class twodarray04{
    public static void main(String args[]){
         int arr[][]={{1,1,1},
        {1,1,1},
        {2,3,4}
            
        };
        for(int i=0;i<arr.length;i++){
            int colsum=0;
            for(int j=0;j<arr[i].length;j++){
                colsum+=arr[j][i];
                
            }
            System.out.println("the sum of "+(i+1)+"  columnis ::"+colsum);
        }
    }
}