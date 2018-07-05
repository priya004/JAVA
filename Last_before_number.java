import java.util.*;
import java.lang.*;
import java.io.*;
class Last_before
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int number,last_number,last_before_number;
		Scanner s = new Scanner(System.in);
		number = s.nextInt();
		last_number = number / 10;
		number = last_number % 10;
		last_before_number = last_number / 10;
		System.out.println("Last before number is : " + number);
	}
}
