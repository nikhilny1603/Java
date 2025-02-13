import java.util.Scanner;

class Hypotenuse{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        double x;
        double y;
        System.out.println("Enter the First Side : ");
        x = sc.nextDouble();
        System.out.println("Enter the Second Side : ");
        y = sc.nextDouble();
        double z = Math.sqrt((x*x) + (y*y));
        System.out.println("Hypotenuse of the Triangle is "+ z);
    }
}