//You just need to take string input and checks whether the string consists of alphanumeric characters.
// input: You will be given a function with string as an argument.
// output: True/False

import java.util.Scanner;
public class checkalpha {
	public static String stringAlphanumeric(String input1)
    {
	    //Write code here
	        String s = " ";
	        if(input1.matches("[a-zA-Z0-9]+")){
               s = "True";
	        }
	        else{
	            s = "False";
	        }
	        return s;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        String output;
        String ip1 = in.nextLine().trim();
    output = stringAlphanumeric(ip1);
        System.out.println(String.valueOf(output));
	}

}

