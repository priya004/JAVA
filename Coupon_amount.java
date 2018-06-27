import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
      int purchase;
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the purchase amount");
      purchase = s.nextInt();
      if(purchase >= 20000)
        System.out.println("Free Trolley Suitcase");
      else if((purchase >=10000) && (purchase<20000))
         System.out.println("Free travel bag");
      else if((purchase>=5000) && (purchase<10000))
         System.out.println("Free Free BackPck");
      else if(purchase<5000)
         System.out.println("Free Free BackPck");
	}
}
