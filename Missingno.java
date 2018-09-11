//This Program is to check for missing no. in an array.
//Input: An array.
//Output: Missing no.

import java.util.*;
class Main
{
 // Function to find missing number
 public static int getMissingNo (int arr[], int n)
 {
     int i, total;
     total  = (n+1)*(n+2)/2;   
     for ( i = 0; i< n; i++)
        total -= arr[i];
     return total;
 }
 public static void main(String args[])
 {
     int arr[] = {1,2,3,4,6};
     int len = arr.length;
     int miss = getMissingNo(arr,len);
      System.out.print(miss); 
 }
}
