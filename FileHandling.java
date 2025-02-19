import java.io.File;
import java.io.*;
import java.util.Scanner;
class FileHandling{
    public static void main(String []args){
        try{
            File f=new File("Database.txt");
            if(f.createNewFile()){
                System.out.println("File Created "+ f.getName());
            }
            else {
                System.out.println("File Already Exists.");
            }
            FileWriter Writer = new FileWriter("Database.txt");
            Writer.write("Hello Everyone. How Are You ? ");
            Writer.close();
	    Scanner r = new Scanner(f);
		while(r.hasNextLine()){
			String data =  r.nextLine();
			System.out.println(data);
            
        	}
}
        catch(java.lang.Exception e){
            System.out.println("File Handling Error Occured.");
        }
    }
}