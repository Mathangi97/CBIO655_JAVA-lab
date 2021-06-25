import java.io.*;


public class FileRead {

	public static void main(String[] args) throws IOException {
		int a;
		FileReader f=new FileReader("Mathangi.txt");
		while(((a=f.read())!=-1))
		{
			System.out.print((char)a);
		}
		
		f.close();
	}

}