//dsa problem based on sorting
class Marksdsa{
    public static void main(String args[]){
       int n = 6;
       int[] marks = {72, 90, 60, 55, 88, 66};
       for(int i=0;i<marks.length-1;i++){
        int minindex=i;
        for(int j=i+1;j<marks.length-1;j++){
            if(marks[j]<marks[minindex]){
                minindex=j;
            }

        }
        int temp=marks[i];
        marks[i]=marks[minindex];
        marks[minindex]=temp;


       }
       for(int num : marks){
        System.out.println(num);
       }
    }
}