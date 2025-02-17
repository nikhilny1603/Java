public class DataTypes{
    public static void main(String[] args){
        char a = 66;
        System.out.println(a);
        char b = '\'';
        System.out.println(b);
        char c = '\u2764';
        System.out.println(Character.toString(c));
        for (int i = 0; i <= 26; i++) {
 char letter = (char) ('a' + i);
 System.out.println(letter);
}
    float f1 = 0f;
float f2 = -0f;
System.out.println(f1 == f2); // true
System.out.println(1f / f1); // Infinity
System.out.println(1f / f2); // -Infinity
System.out.println(Float.POSITIVE_INFINITY / Float.POSITIVE_INFINITY); // NaN
System.out.println(Integer.MAX_VALUE);
System.out.println(Integer.MIN_VALUE);
double d = 18.96;
//int r = d; // invalid conversion to int, will throw a compile-time error
int r = (int) d;
System.out.println(r);
double dou = 34.3e11;
System.out.println(dou);
    }
}