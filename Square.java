public class Square {
    static int side = 5;
    public static void area(){
        double area = side*side;
        System.out.println("Area of the Square is "+area);
    }
    public static void Perimeter(){
        double perimeter = 4*side;
        System.out.println("Perimeter of the Square is "+perimeter);
    }
    public static void main(String[] args) {
        area();
        Perimeter();
    }
}
