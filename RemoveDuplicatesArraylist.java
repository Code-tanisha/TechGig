//Program is to Remove duplicate elements from ArrayList.
//Input: ArrayList with duplicates.
//Output: ArrayList without duplicates.

import java.util.ArrayList;
import java.util.HashSet;
public class RemoveDuplicates {
  public static void main(String[] args) {
		//Constructing ArrayList
		ArrayList<String> listwithduplicates = new ArrayList<String>();
		listwithduplicates.add("JAVA");
		listwithduplicates.add("C");
		listwithduplicates.add("PYTHON");
		listwithduplicates.add("JAVA");
		listwithduplicates.add("C++");
		listwithduplicates.add("HASH");
		System.out.println("Printing list with duplicates");
		System.out.println(listwithduplicates);
		HashSet<String>set = new HashSet<String>(listwithduplicates);
		//constructing list without duplicate elements
		ArrayList<String> listwithoutduplicates = new ArrayList<String>(set);
		System.out.println("ArrayList after removing duplicates");
		System.out.println(listwithoutduplicates);
	  }
}
