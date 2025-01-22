public class Circle {
    static int radius = 5;
    public static void AreaofCircle(){
        double area = 3.142*radius*radius;
        System.out.println("Area of the Circle is "+area); 
    }
    public static void Circumference(){
        double cir = 2*3.142*radius;
        System.out.println("Circumference of the Circle is "+cir);
    }
    public static void main(String[] args) {
        AreaofCircle();
        Circumference();
    }
}