package SortingInJava.BubbleSort;

public class BubbleSortInIntegerArray {
    public static void main(String[] args) {
        int [] a = {36,19,29,12,5,15,25,40,1,10,18,50,7,23,6,34};

         for(int i = 0; i < a.length; i++){
             int flag = 0;
             for(int j = 0; j < (a.length - 1 - i); j++){
                 if(a[j] > a[j+1]){
                     int temp = a[j];
                     a[j] = a[j+1];
                     a[j+1] = temp;
                     flag = 1;
                 }
             }
             if(flag == 0){
                 break;
             }
         }

         for(int i = 0; i<a.length; i++){
             System.out.print(a[i]+ " ");
         }
    }
}
