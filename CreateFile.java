import java.io.*;
import java.util.*;
class CreateFile{
public static void main(String []args){
File f=new File("D:\\133\\Abc.txt");
try{
	if(f.createNewFile()){
		System.out.println("File is created successfully.");
	}
	else{
		System.out.println("File already exists.");
	}
	FileWriter fw=new FileWriter("Abc.txt");
	fw.write("Hii Everyone, I am Doing a File Handling Program.");
	fw.close();
	System.out.println("File Updated Successfully.");
	Scanner Reader = new Scanner(f);
            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.println(data);
            }
            Reader.close();
	if(f.delete()){
		System.out.println("File Deleted Successfully.");
	}
	else{
		System.out.println("File Deleted Unsuccessfully.");
	}
}
catch(java.lang.Exception e){
	System.out.println("Input Output Exception Occured.");
}

}
} 