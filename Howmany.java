import java.util.Random;
import java.util.Scanner;

public class Howmany {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Please enter the number of times you want to roll: ");
		int times = in.nextInt();
	
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;	
		
	
		
		for (int number = 1; number<times+1; number++)
		{
			int dice = rand.nextInt(6)+1;
			
			if (dice==1)
				one+=1;
			if (dice==2)
				two+=1;
			if (dice==3)
				three+=1;
			if(dice==4)
				four+=1;
			if(dice==5)
				five+=1;
			if (dice==6)
				six+=1;
		
		}
		System.out.printf("Number", "/n%-10s", "/n%-10s", "/n-10s", "/n-10s", "%-10s" , "%-10s" , one, two, three, four, five, six);
	}

}
