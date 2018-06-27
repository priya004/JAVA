import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
      int n;
      Scanner s = new Scanner(System.in);
      System.out.println(" 0.Sunday \n 1.Monday \n 2.Tuesday \n 3.Wednesday \n 4.Thursday \n 5.Friday \n 6.Saturday \n");
      System.out.println("Enter today's day:");
      n = s.nextInt();
      switch(n){
        case 0:
          System.out.println("Free Personal Pizza on purchase of medium Pizza");
          break;
        case 1:
          System.out.println("Rs.101 OFF on a bill of Rs.400 and above");
          break;
        case 2:
          System.out.println("Free Plain Garlic Bread on another medium pizza");
          break;
        case 3:
          System.out.println("Buy 1 Get 1 Free on any medium pizza");
          break;
        case 4:
          System.out.println("Buy any medium pizza and get 50% off on another medium pizza");
          break; 
        case 5:
          System.out.println("Tastiest pizza 20% off on bill of Rs.399 or above");
          break; 
        case 5:
          System.out.println("Get Together Offer Free Garlic Bread and Dip on a min bill of Rs.350");
          break; 
	}
}
