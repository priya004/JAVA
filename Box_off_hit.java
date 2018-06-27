import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
      int Daysintheater;
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the number of days in the theater:");
      Daysintheater = s.nextInt();
      if(Daysintheater >= 50){
        System.out.println("\nBox office hit");
       else
         System.out.println("\nFlop");
          
	}
}
