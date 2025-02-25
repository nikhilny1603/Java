import java.util.*;
import java.util.Scanner;

class Temperature {
    public void Display(){
        System.out.println("\n** Temperature Converter **\n");
        System.out.println("1) Celcius to Fahrenheit");
        System.out.println("2) Celcius to Kelvin");
        System.out.println("3) Exit");
    }
    public void CelciustoFahrenheit(double Celcius){
        if(Celcius < 0){ 
            System.out.println("Error: Celcius cannot be negative");
            return ;
        }
        double Fahrenheit = (Celcius * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit : "+ Fahrenheit + "F" );
    }
    public void CelciustoKelvin(double Celcius){
        if(Celcius < 0){
            System.out.println("Error: Celcius cannot be nagative");
            return;
        }
        double Kelvin = (Celcius + 273.15);
        System.out.println("Temperature in Kelvin : "+ Kelvin +"K");
    }
} 

class TemperatureConversion{
    public static void main(String []args){
        Temperature t = new Temperature();
        Scanner sc = new Scanner(System.in);
        
        while(true){
            t.Display();
            System.out.print("\nChoose one from the above : ");
            int ch = sc.nextInt();
            System.out.print("\nEnter the Temperature in Celcius : ");
        double temp = sc.nextDouble();
            switch (ch) {
                case 1:
                    t.CelciustoFahrenheit(temp);
                break;
                case 2:
                    t.CelciustoKelvin(temp);
                break;
                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                return;
                default:
                    System.out.println("Please, choose a valid Option...");
                break;
            }
        }
    }
}
