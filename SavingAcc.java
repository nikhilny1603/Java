class Interest{
double balance;
static double annualInt;

Interest(double bal){
this.balance=bal;
}
void monthlyInt(){
double monthlyInterest=(balance*annualInt/12)/100;
balance+=monthlyInterest;
}
void PrintMonthly(){
System.out.println("Balance : "+ balance);
}
static void ModifyInterest(double newrate){
annualInt=newrate;
}
}
class SavingAcc{
public static void main(String[] args){
Interest s1=new Interest(1000.0);
Interest s2=new Interest(2000.0);
Interest.ModifyInterest(4.0);
System.out.println("\nInterest Rate 4% : ");
s1.monthlyInt();
s1.PrintMonthly();
s2.monthlyInt();
s2.PrintMonthly();
Interest.ModifyInterest(5.0);
System.out.println("\nInterest Rate 5% : ");
s1.monthlyInt();
s1.PrintMonthly();
s2.monthlyInt();
s2.PrintMonthly();

}
}
