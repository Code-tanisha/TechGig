//This Program is to make words in Dictionary order.
//Input: N lines contains Strings one on each line.
//Output: Lexicographically sorted order.

import java.util.*;
public class Main {
public static void main(String[] args) {
	 int i,n;						
     Scanner in=new Scanner(System.in);

 n=in.nextInt();
String arr[]=new String[n]; 
for (i=0; i<arr.length; i++){
	arr[i]=in.next();
}
Arrays.sort(arr);
for(String s:arr)
	System.out.println(s);
	}
}
