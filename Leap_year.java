import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int year = 2000;
        boolean isLeapYear = false;
 
        if(year % 400 == 0)
        {
            isLeapYear = true;
        }
        else if (year % 100 == 0)
        {
            isLeapYear = false;
        }
        else if(year % 4 == 0)
        {
            isLeapYear = true;
        }
        else
        {
            isLeapYear = false;
        }
 
        //Output the test result
        if(isLeapYear)
        {
            System.out.println("Year "+year+" is a Leap Year");
        }
        else
        {
            System.out.println("Year "+year+" is not a Leap Year");
        }
 
    }
}
	}
}
