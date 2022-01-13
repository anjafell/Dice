import java.util.Scanner;
	
public class Dice
{
	public static void main(String[] args)
	{
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter what size die you would like to roll.");

		int sides = myObj.nextInt();

		int randomNum = (int)(Math.random() * sides);
		System.out.println(randomNum+1);

	}
}