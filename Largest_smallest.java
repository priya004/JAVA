import java.util.*;
import java.lang.*;
import java.io.*;
public class Largestsmallest{
  public static void main(String[] args){
    int a[] = new int[] { 15,2,69,55,10,96 };
    int min = a[0];
    int max = a[0];
    for(int i = 0;i<a.length;i++){
      if(a[i] > max){
        max = a[i];
      }
      if(a[i] < min){
        min = a[i];
      }
    }
    System.out.println("Largest number in the array: " +max);
    System.out.println("Smallest number in the array: " +min);
  }
}
