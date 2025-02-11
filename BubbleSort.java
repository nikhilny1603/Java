import java.util.*;
class Bubble{
        public static void Sort(int []arr){
                    int n=arr.length;
            for(int i=0;i<n;i++){
                for(int j=0;j<n-i-1;j++){
                    if(arr[j]>arr[j+1]){
                          int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
        }  
    }
    
class BubbleSort{
        public static void main(String []args){
            Bubble b=new Bubble();
        int []arr=new int[]{1,5,8,3,2,6,9,7};
        b.Sort(arr);
        printArr(arr);
}
       public static void printArr(int[] arr){
        for(int i=0;i<8;i++){
            System.out.print(arr[i] + " ");
        }
    }
}