//This Program is to check the 2nd largest number.
//Input: An Array.
//Output: 2nd largest element.

import java.io.*;
import java.util.*;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {

	//Write code here
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 int n = Integer.parseInt(br.readLine());
 String s = br.readLine();
 String[] num = s.split(" ");
 int arr[]=new int[n];
 for(int i = 0; i < n; ++i)
     arr[i] = Integer.parseInt(num[i]);
     Arrays.sort(arr);
     System.out.println(arr[n-2]);
   }
}
