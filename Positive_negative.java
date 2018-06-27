import java.util.*;
Public class Positivenegative{
  Public static void main(String[] args){
    int number;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the integer");
    number = s.nextInt();
    if(number<0)
      System.out.println("Negative");
    else if(number>0)
      System.out.println("Positive");
    else if(number == 0)
      System.out.println("Zero");
  }
}
