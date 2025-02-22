public class Vehicle{
    public static void main(String []args){
        Car c = new Car('Royce Royal', 'Navy Blue', 5000000);
        Vehicle v = new Vehicle(c);
        System.out.println("Name of the Car  : "+ v.c.getName());
        System.out.println("Color of the Car : "+ v.c.getcolor());
        System.out.println("Price of the Car : "+ v.c.getPrice());
    }
}
public class Car{
    private String carName;
    private String color;
    private int price;
    Car(String carName,String color,int price){
        this.carName = carName;
        this.color = color;
        this.price = price;
    }
    public String getName(){
        return this.carName;
    }
    public String getcolor(){
        return this.color;
    }
    public int getPrice(){
        return this.price;
    }
    public String setName(String Name){
        if(Name!==null && Name.length>2){
            return Name;
        }
        else{
            return 'Invalid Name.';
        }
    }
    public String setcolor(String color){
        if(color!=null && color.length>2){
            return color;
        }
        else{
            return 'Invalid Color.';
        }
    }
    public int setprice(int price){
        if(price!=null && price > 100000){
            return price;
        }
        else{
            return 'Invalid Price.';
        }
    }
}