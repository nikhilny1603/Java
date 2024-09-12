import java.io.*;

class FileHandling{
	public static void main(String []args){
		File f=new File("D:\\133\\NewFile.txt");
try{
	if(f.createNewFile()){
		System.out.println("File is created successfully.");
	}
	else{
		System.out.println("File already exists.");
	}
	FileReader fr=new FileReader(f);
	BufferedReader bf=new BufferedReader(fr);
	String line;
	while((line = bf.readLine())!=null){
		System.out.println(line);
}
	bf.close();
	fr.close();
}
catch(java.lang.Exception e){
		System.out.println("An error occured."+ e.getMessage());
	}
	}
}