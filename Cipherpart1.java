import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Cipherpart1 
{

	public static void main(String[] args) throws IOException 
	{
		Scanner in = new Scanner(System.in);
		
		
		int shift = -3;
		
		System.out.println("Please enter a file name: ");
		String myFiletxt = in.nextLine();
		
		File file1 = new File(myFiletxt.substring(0, myFiletxt.length()-4)+"_ENC.txt");
		PrintWriter out = new PrintWriter(file1);//writes to file
		Scanner reader = new Scanner (new File(myFiletxt));//able to read from file
	
		String line;
		int num; 
		char charread;
		
		while(reader.hasNext())
		{
			line = reader.nextLine();
				for (int i = 0; i<line.length(); i++)
				{
					
				}
		}
	}

}
