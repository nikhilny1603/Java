import java.util.*;
import java.io.*;

class myThreadA extends Thread{
public void run(){
for(int i=1;i<=5;i++){
System.out.println("Thread A : "+ i);
try{
Thread.sleep(1000);
}
catch(InterruptedException e){
	System.out.println(e);
		}
	}
	}
}

class myThreadB extends Thread{
public void run(){
for(int i=1;i<=5;i++){
System.out.println("Thread B : "+ i);
try{
Thread.sleep(1000);
}
catch(InterruptedException e){
	System.out.println(e);
		}
	}
	}
}
class ThreadExample{
public static void main(String args[]){
myThreadA threadA= new myThreadA();
myThreadB threadB =  new myThreadB();
threadA.start();
threadB.start();
}
}







