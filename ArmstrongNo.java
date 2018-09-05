//This Program is to check for Armstrong no.
//Input: Single Integer value.
//Output:True/False.

import java.util.*;
public class Main {
public static void main(String[] args) {
	int sum = 0, temp, d;
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	temp = n;
	while(temp > 0){
	    d = temp%10;
	    sum = sum + (d*d*d);
	    temp = temp / 10;
	    
	}
	if(sum == n)
	    System.out.println("True");
	    else
	    System.out.println("False");

	}
}
