import MyMath.Trig;
import MyMath.Arithmetic;
import MyMath.Stat;

public class PackDemo {
    public static void main(String[] args) {
        // Demonstrating Trig class
        Trig trig = new Trig(45); // Angle in degrees
        System.out.println("Sine: " + trig.getSine());
        System.out.println("Cosine: " + trig.getCosine());
        System.out.println("Tangent: " + trig.getTangent());
        System.out.println("Secant: " + trig.getSecant());
        System.out.println("Cosecant: " + trig.getCosecant());
        System.out.println("Cotangent: " + trig.getCotangent());

        // Demonstrating Arithmetic class
        Arithmetic arithmetic = new Arithmetic();
        System.out.println("Addition: " + arithmetic.add(10.5f, 5.2f));
        System.out.println("Subtraction: " + arithmetic.subtract(10.5f, 5.2f));
        System.out.println("Multiplication: " + arithmetic.multiply(10.5f, 5.2f));
        System.out.println("Division: " + arithmetic.divide(10.5f, 5.2f));

        // Demonstrating Stat class
        Stat stat = new Stat();
        double[] values = {10.5, 20.0, 5.0, 15.5};
        System.out.println("Min: " + stat.min(values));
        System.out.println("Max: " + stat.max(values));
        System.out.println("Count: " + stat.count(values));
        System.out.println("Sum: " + stat.sum(values));
        System.out.println("Average: " + stat.average(values));
    }
}
