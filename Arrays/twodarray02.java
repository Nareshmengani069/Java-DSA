//Find the sum of all elements in a 2D array.
class twodarray02{
    public static void main(String args[]){
        int arr[][]={{1,1,1},
        {1,1,1},
        {1,1,1}
            
        };
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
               sum+=arr[i][j]; 
            }
        }
        System.out.println(sum);
        
    }
}