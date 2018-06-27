import java.util.*;
import java.lang.*;
import java.io.*;
class Lastdigi
{
	static int last(int num){
		return(num % 10);
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		int number,last;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		number = s.nextInt();
		System.out.println("Last digit is: " +last(number));
	}
}
