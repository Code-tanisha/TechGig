//This Program is Multiply Minimum and Maximum elements from the Array.
//Input: An Array.
//Output: Multiplication of Minimum and Maximum number.

import java.io.*;
import java.util.*;
public class CandidateCode {
   public static void main(String args[] ){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[] = new int[n];
	for(int i = 0; i < n; i++){
	    arr[i]=sc.nextInt();
	}
	int min = arr[0];
	int max = arr[0];
	for(int i = 1; i < n; i++){
	    min = Math.min(min,arr[i]);
	    max = Math.max(max,arr[i]);
	}
	System.out.println(min*max);

   }
}
