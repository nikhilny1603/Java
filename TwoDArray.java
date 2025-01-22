



public class TwoDArray {
    public static void output1(int [][]arr){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(arr[j][i] + " ");
            }
        }
    }
    public static void output2(int [][]arr){
        for(int i = 0; i < 5; i++){
            if(i%2 == 0){
            for(int j = 0; j < 5; j++){
                System.out.print(arr[i][j] + " ");
            }
        }
            else {
                for (int j = 4; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }

    public static void output3(int [][]arr){
        int i;
        int j;
        for( i = 0; i < 5; i++){
            for( j = 0; j < 5; j++){
                if( i == j ){
                System.out.print(arr[i][j] + " ");
                }
            }
        }
        for( i = 0; i < 5; i++){
            for( j = 0; j < 5; j++){
                if( i + j == 4){
                System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
        public static void main(String []args){
            int arr[][] = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25},
                };
                System.out.println("First Output : ");
                output1(arr);
                System.out.println("\nSecond Output : ");
                output2(arr);
                System.out.println("\nThird Output : ");
                output3(arr);
        }
}
