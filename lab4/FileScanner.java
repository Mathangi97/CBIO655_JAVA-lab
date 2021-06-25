import java.io.*;
import java.util.*;


public class FileScanner 
{
	public static void main(String[] args) throws IOException
	{
	FileReader fr=new FileReader("Numbers.txt");
	FileWriter fw=new FileWriter("Even.txt");
	Scanner sc=new Scanner(fr);
	int a=0,sum=0;
	fw.write("Even numbers from the set are: \n");
	for(int i=0;sc.hasNextInt();i++)
	{
	a=sc.nextInt();
	if(a%2==0)
	fw.write(a+"\n");
	}
	System.out.println("Done!");
	fr.close();
	fw.close();
	}

}