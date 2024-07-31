class Mobile{
String brand;
int price;
static String name;

void show(){
	System.out.println("Name of the Device : " + name);
	System.out.println("Brand of the Mobile : " +brand);
	System.out.println("Price of the Mobile : "+ price);
}
}
class StaticVariable{
	public static void main(String[] args){
		Mobile m1=new Mobile();
		Mobile m2=new Mobile();
		System.out.println("\n* Details of 1st Mobile *\n");
		m1.brand="Apple";
		m1.price=100000;
		m1.name="Smartphone";

		m2.brand="Samsung";
		m2.price=120000;
		m2.name="Phone";
		//m1.name="MobilePhone";
		m1.show();
		System.out.println("\n* Details of 2nd Mobile *\n");
		m2.show();
}
}