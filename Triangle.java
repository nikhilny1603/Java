import java.util.Scanner;

class TriangleImp {
    Scanner sc = new Scanner(System.in);
    private double x;
    private double y;
    private double z;

    public TriangleImp(){
    }
    public TriangleImp(double a,double b,double c){
        this.x = a;
        this.y = b;
        this.z = c;
    } 
    public double getS1(){
        return x;
    }
    public double getS2(){
        return y;
    }
    public double getS3(){
        return z;
    }
    public void setS1(double a){
        this.x = a;
    }
    public void setS2(double b){
        this.y = b;
    }
    public void setS3(double c){
        this.z = c;
    }
    public void Accept(){
        System.out.println("Enter the Values of the Sides of the Triangle : ");
        this.x = sc.nextDouble();
        this.y = sc.nextDouble();
        this.z = sc.nextDouble();
    }
    public void Display(){

    }
    public double CalcPeri(){
        return this.x + this.y + this.z;
    }
    public boolean IsValid(){
        if((this.x + this.y > this.z) || (this.x + this.z > this.y) || (this.z + this.y > this.x)){
            return true;        }
        else{
            return false;
        }
    }

}
public class Triangle{
    public static void main(String[] args) {
        TriangleImp[] t = new TriangleImp[4];
        for (int i = 0 ; i < t.length; i++) {
            t[i] = new TriangleImp();
            t[i].Accept();
        }
        for(int i = 0 ; i < t.length ;i++){
        if(t[i].IsValid()){
            System.out.println("Perimeter of Traingle "+ i + "is : "+ t[i].CalcPeri());
        }
        else{
            System.out.println("Invlaid Triangle...");
        }
    }
    }
}