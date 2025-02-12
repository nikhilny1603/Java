public class TypeCasting{
    public static void main(String []args){
       //Implicit casting
/*byte byteVar = 42;
short shortVar = byteVar;
int intVar = shortVar;
long longVar = intVar;
float floatVar = longVar;
double doubleVar = floatVar;
System.out.println(byteVar);
System.out.println(shortVar);
System.out.println(intVar);
System.out.println(longVar);
System.out.println(floatVar);
System.out.println(doubleVar);*/

//Explicit casting
double doubleVar = 42.0d;
float floatVar = (float) doubleVar;
long longVar = (long) floatVar;
int intVar = (int) longVar;
short shortVar = (short) intVar;
byte byteVar = (byte) doubleVar;
System.out.println(byteVar);
System.out.println(shortVar);
System.out.println(intVar);
System.out.println(longVar);
System.out.println(floatVar);
System.out.println(doubleVar);

    }
}