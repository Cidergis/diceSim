//This will be the main class of the Dice Simulator program. Which will "roll dice of any defined type
// any amount of times and with any amount of dice. Then will use a subclass to write data to a text document.
// There will also be a subclass that will graph the data found in the text document.
// By Lars N Kuhlmann-Courtwright,
// V 0.035 Date Created (9/29/2015) Last Modified (10/1/2015)
//*
import java.util.Scanner ;
public class dSimMain
{
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in) ;
		int diceQuantity , rollQunatity ;
		String numSides ;
		boolean flag = true ;
		do
		{
			System.out.print("Enter your desired number of sides: ") ;
			numSides = stdin.nextLine() ;
			if (numSides.matches("end|quit|stop"))
			{
				flag = false ;
			}
			else if (numSides.equals("help"))
			{
				System.out.println("Input the type of Die you wish to use by refering to " +
				"the number of faces it has. Example \"12\" for a die 12 or \"4\" for die 4" +
				" Compatible Die sizes are as follows (4,6,10,12,20,100)\n Please type \"end\"" +
				" or \"quit\" to end the program.") ;
			}
			else if (!numSides.matches("[0-9]+"))
			{
				System.out.println("Your input was not a recognizable die type. Please input " +
				"your die type or type \"help\"") ;
			}
			else if (numSides.length() > 3)
			{
				System.out.println("Your input was not a recognizable die type. Please input " +
				"your die type or type \"help\"") ;
			}
		}
		while (!numSides.matches("4|6|10|12|20|100") || flag) ;
		System.out.println("\n" + "You chose a " + numSides + " sided die." + "\n") ;
		String diceQTemp ;
		do
		{
			System.out.println("Enter how many dice should be rolled") ;
			diceQTemp = stdin. nextLine() ;
			if (diceQTemp.equals("end|quit"))
			{
				flag = false ;
			}
			else if (diceQTemp.matches("1|2|3|4|5|6|7|8"))
			{
				flag = false ;
			}
		}
		while(flag == true && !diceQTemp.matches("[0-9]+")) ;
		System.out.println("\n" + "You chose to  roll a " + numSides + " sided die " + diceQTemp + " times." + "\n") ;
	}
}
