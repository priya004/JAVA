import java.util.*;
Public class Even{
  Static int test(int num){
    if(num % 2 == 0 || num == 0)
      return 2;
    else
      return 1;
  }
  Public static void main(){
    int number;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number");
    number = s.nextInt();
    System.out.println("Result " +test(number));
  }
}
