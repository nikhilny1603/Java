class ComplexNumber {
    int real;
    int imag;

    public ComplexNumber(int r,int i) {
        this.real = r;
        this.imag = i;
        System.out.println("Real Number is "+r);
        System.out.println("imaginary Number is "+i);
    }
        
}
public class Complex{
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int i = Integer.parseInt(args[1]);
        ComplexNumber c = new ComplexNumber(r, i);
    }
}
