class SavingAcc{
int accNo;
String AccHolder;
int balance;
int duration;
static int InterestRate;

void show(){
System.out.println(accNo);
System.out.println(AccHolder);
System.out.println(balance);
int Interest=(balance*InterestRate*duration)/100;
System.out.println(Interest);
}
}
class CalculateInterest{
public static void main(String[] args){
SavingAcc s1=new SavingAcc();
SavingAcc s2=new SavingAcc();
s1.accNo=123;
s1.AccHolder="nikhil";
s1.balance=1000;
s1.duration=12;
s1.InterestRate=5;
s2.accNo=122;
s2.AccHolder="nikhil";
s2.balance=10000;
s2.duration=2;
s2.InterestRate=4;
s1.show();
s2.show();

}
}