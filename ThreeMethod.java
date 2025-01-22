

public class ThreeMethod {
    private double num;
    public ThreeMethod(){
    }    
    public ThreeMethod(double n){
        this.num = n;
    }
    public static double Factorial(double n){
        if (n == 0) { 
            return 1;
        } else {
            return n * Factorial(n - 1); 
        }
    }
    public static boolean  isPrime(double n){
        if (n <= 1) {
            return false; 
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; 
            }
        }
        return true;
    }
    public static void PrintPositiveNegative(double n){
        if(n > 0){
            System.out.println("Number is Positive...");
        }
        else{
            System.out.println("Number is Negative...");
        }
    }
    public static void main(String[] args) {
        double n = 5.0;
        System.out.println("Factorial of "+ n +"is :"+Factorial(n));
        System.out.println(isPrime(n));
        
        PrintPositiveNegative(n);
    }
}
