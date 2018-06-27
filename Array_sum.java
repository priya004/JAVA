import java.util.*;
import java.lang.*;
import java.io.*;
public class Test{
  static int array[] = {15 , 2 , 63 , 16 , 20};
  static int sum(){
    int sum = 0;
    int i;
    for(i=0;i<array.length;i++)
      sum += array[i];
    return sum;
  }
 Public static void main(String[] args){
  System.out.println("Sum: " +sum());
 }
}
