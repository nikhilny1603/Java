interface Bubble {
    void sort(int[] arr);
}
class BubbleSort implements Bubble {
int n = 7;
public void sort(int []arr) {

     for (int i=0;i<n-1;i++) {
         for (int j=0;j<n-i-1;j++) {
             if (arr[j]>arr[j+1]) {
                 int temp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
             }
         }
      }
  }

}
class Main {
    public static void main(String[] args) {
        int[] arr={3,2,6,8,5,0,1};

        Bubble b=new BubbleSort();
        System.out.print("Bubble Sort Elements: \n");
        b.sort(arr);
	printArray(arr);
        System.out.println();
    }
	public static void printArray(int []arr) {
        for (int i=0;i<arr.length;i++) {
            System.out.println( i + " ");
        }
}
}
