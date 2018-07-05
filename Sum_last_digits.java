import java.util.*;
import java.lang.*;
import java.io.*;
class Sum_last_digits
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int input1,input2,sum;
		Scanner s = new Scanner(System.in);
		input1 = s.nextInt();
		input2 = s.nextInt();
		input1 = input1 % 10;
		input2 = input2 % 10;
		sum = input1 + input2;
		System.out.println("The sum is : " +sum);
	}
}
