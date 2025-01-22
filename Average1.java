import java.util.Scanner;

public class Average1 {
    public static void Avg() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the First Number: ");
        if (sc.hasNextDouble() && !sc.hasNextInt()) {
            double a = sc.nextDouble();
            
            System.out.println("Enter the Second Number: ");
            if (sc.hasNextDouble() && !sc.hasNextInt()) {
                double b = sc.nextDouble();
                
                double avg = (a + b) / 2;
                System.out.println("Average of the Two Numbers is " + avg);
            } else {
                System.out.println("Please, Enter a valid Double Value for the second number.");
            }
        } else {
            System.out.println("Please, Enter a valid Double Value for the first number.");
        }
    }

    public static void main(String[] args) {
        Avg();
    }
}
