//This Program is to calculate the power using Recursion.
//Input: 2 Integers.
//Output: Power.
import java.io.*;
import java.util.*;
public class CandidateCode {
    static int num = 1;
   public static void main(String args[] ){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int pow = sc.nextInt();
int number = power(n,pow);
System.out.println(number);
   }
  static int power(int n, int pow){
       if(pow>=1){
           num*=n;
           power(n,pow-1);
       }
       return num;
 
