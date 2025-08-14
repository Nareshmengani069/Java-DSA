//Print the sum of each row
class twodarray03{
    public static void main(String args[]){
        int arr[][]={{1,1,1},
        {1,1,1},
        {1,1,1}
            
        };
        for(int i=0;i<arr.length;i++){
            int rowsum=0;
            for(int j=0;j<arr[i].length;j++){
                rowsum+=arr[i][j];
            }
            System.out.println("the sum of "+(i+1)+" row::"+rowsum);
    }
    }
}