//This Program is to Convert a binary no to Decimal.
//Input: Binary no.
//Output: Decimal no.

import java.io.*;
import java.util.*;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(in.readLine());
	int i = 0;
	int sum = 0;
	while(n>0){
	    sum = (int)(sum+n%10*Math.pow(2,i++));
	    n = n/10;
	}
	System.out.println(sum);
   }
}
