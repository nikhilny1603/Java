public class rectangle {
    private int length;
    private int breadth;


public rectangle() {
    this.length=20;
    this.breadth=10;
}

public int getlength() {
    return this.length;
}

public int getbreadth() {
    return this.breadth;
}

public static void main(String args[]){
    rectangle c = new rectangle();
    int area = c.getlength() * c.getbreadth();
    int perimeter = 2*(c.getlength()+c.getbreadth());
    System.out.println("Area of rectangle : "+area);
    System.out.println("perimeter of rectangle : "+perimeter);
}
}