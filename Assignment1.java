package cs1400;
/*-------------------------------------------------------------------------
//AUTHOR: Chris Iang
//FILENAME: Assignment1
//SPECIFICATION: the program asks for the athete's name. Then the program collects three javelin throws in meters. At the end, the three throws will be displayed in various dimensions(meters, yards, feet, inches, and centimeters)
//FOR: CS 1400- Assignment #1
//TIME SPENT: 
//-----------------------------------------------------------*/

//All imports have to be outside class
import java.util.Scanner;

//class name should match the file name
public class Assignment1
{
	// we must have a main method to run the program
public static void main (String[] args)
{
	Scanner scan = new Scanner(System.in);
	// declare variables of different types:
  	String name;
  	double throw1, throw2, throw3;
  	double yard1, yard2, yard3;
  	double ft1, ft2, ft3;
  	double in1, in2, in3;
  	double cm1, cm2, cm3;

		// get the user data
  		System.out.println("Enter the competrtrtitor's name: ");
  		name = scan.nextLine();
  		System.out.println("\n\t\tOlympic Javelin Throws\n\tEnter the distances, in meters, for " + name);
  		System.out.println("\nPlease enter the distance for throw 1: ");
  		throw1 = scan.nextDouble();
  		System.out.println("Please enter the distance for throw 2: ");
  		throw2 = scan.nextDouble();
  		System.out.println("Please enter the distance for throw 3: ");
  		throw3 = scan.nextDouble();
		// calculate conversions
		yard1 = throw1*1.093;
		yard2 = throw2*1.093;
		yard3 = throw3*1.093;
		ft1 = yard1*3;
		ft2 = yard2*3;
		ft3 = yard3*3;
		in1 = ft1*12;
		in2 = ft2*12;
		in3 = ft3*12;
		cm1 = throw1*100;
		cm2 = throw2*100;
		cm3 = throw3*100;

		// output
  		//System.out.println("\nThrows:\n\tYards: " + yard1 + " " + yard2 + " " + yard3);
		System.out.printf("%-10s%-10s%-10s%-10s", "Yards", "Feet", "Inches", "Cm");
  		System.out.printf("\n%-10.2f%-10.2f%-10.2f%-10.2f", yard1, ft1, in1, cm1);
  		System.out.printf("\n%-10.2f%-10.2f%-10.2f%-10.2f", yard2, ft2, in2, cm2);
  		System.out.printf("\n%-10.2f%-10.2f%-10.2f%-10.2f", yard3, ft3, in3, cm3);
		
		// close Scanner
  		scan.close();
}
}
