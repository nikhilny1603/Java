import java.util.*;
class Insertion {

    public static void Sort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
               int temp=arr[i];
               int j=i-1;
               while (j>=0 && arr[j]>temp){
                    arr[j+1]=arr[j];
                    j--;
               }
               arr[j+1]=temp;
        }
    }
}
class InsertionSort1{
    public static void main(String[] args){
        int []arr=new int[]{3,4,6,8,4,2,1,8,7,9,0};
        Insertion i=new Insertion();
        i.Sort(arr);
        printArr(arr);
    }
    public static void printArr(int[] arr){
        for (int j=0;j<11;j++){
            System.out.print(arr[j]+" ");
        }
    }
}