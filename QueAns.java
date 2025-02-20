import java.util.Scanner;

public class QueAns {
    public static void main(String[] args) {
        int count = 0; 
        Scanner sc = new Scanner(System.in);
        count = QueAndAns(sc); 
        System.out.println("Your total score: " + count);
        System.out.println();
        sc.close(); 
    }

    static int QueAndAns(Scanner sc) {
        int count = 0; 

        System.out.println("What is the Capital of India?");
        System.out.println("1. Mumbai\t2. New Delhi\n3. Chennai\t4. Kolkata");
        String user = sc.next();
        if (user.equals("2")) {
            count++;
            System.out.println("Correct Answer.\n");
        } else {
            System.out.println("Wrong Answer.\n");
        }

        System.out.println("What is the Financial Capital of India?");
        System.out.println("1. Mumbai\t2. New Delhi\n3. Chennai\t4. Kolkata");
        user = sc.next();
        if (user.equals("1")) {
            count++;
            System.out.println("Correct Answer.\n");
        } else {
            System.out.println("Wrong Answer.\n");
        }

        System.out.println("What is the Short Form of State Bank of India?");
        System.out.println("1. SBOI\t2. SBII\n3. SBI\t4. BOI");
        user = sc.next();
        if (user.equals("3")) {
            count++;
            System.out.println("Wrong Answer.\n");
        } else {
            System.out.println("You Entered Wrong Option.\n");
        }

        System.out.println("How Many Continents are there in the World?");
        System.out.println("1. 5\t2. 7\n3. 8\t4. 6");
        user = sc.next();
        if (user.equals("2")) {
            count++;
            System.out.println("Correct Answer.\n");
        } else {
            System.out.println("Wrong Answer.\n");
        }

        System.out.println("Which is the Best Netflix Series to Watch?");
        System.out.println("1. Stranger Things\t2. Wednesday\n3. Squid Game\t4. Dark");
        user = sc.next();
        if (user.equals("1")) {
            count++;
            System.out.println("Correct Answer.\n");
        } else {
            System.out.println("Wrong Answer.\n");
        }

        return count; // Returning the count
    }
}
