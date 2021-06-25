import java.io.*;
public class FileWrite 
{
	public static void main(String[] args) throws IOException
	{
	FileWriter f=new FileWriter("Mathangi1.txt");
	String str="Mathangi S";
	for(int i=0;i<str.length();i++) {
		f.write(str.charAt(i));
		}
	System.out.println("File created and written!");
	f.close();
	}

}
