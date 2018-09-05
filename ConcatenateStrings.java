//This Program is to concatenate two Strings.
//Input: Two Strings.
//Output: Concatenated Strings.
import java.util.*;
public class Concatenate{
	public static String connectionOfStrings(String input1,String input2)
    {
	    String str = " ";
	    str = input1.concat(input2);
	    return str;
    }

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String output;
        String ip1 = in.nextLine().trim();
        String ip2 = in.nextLine().trim();
        output = connectionOfStrings(ip1,ip2);
        System.out.println(String.valueOf(output));
	}
}
