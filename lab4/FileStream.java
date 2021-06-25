import java.io.*;

public class FileStream 
{

	public static void main(String[] args) throws IOException 
	{
	File ip=new File("Math_in.txt");
	File op=new File("Math_out.txt");
	FileInputStream fis=new FileInputStream(ip);
	FileOutputStream fos=new FileOutputStream(op);
	int a;
	while(((a=fis.read())!=-1))
	{
	 fos.write(a);
	}
	System.out.println("Done!");
	fis.close();
	fos.close();
	}

}