class Exception{
public static void main(String[] args){
int a=10,b=0,c;
System.out.println("Program Started.");
try{
c=a/b;
System.out.println(c);
}
catch(Exception e){
System.out.println(e);
}
System.out.println("Program Ended.");
}
}