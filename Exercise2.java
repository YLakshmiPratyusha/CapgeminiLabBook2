/**
 * Exercise 2: Create a class containing a method to create the mirror image of a String.
 * The method should return the two Strings separated with a pipe(|) symbol .
 */
package Lab3;

import java.util.Scanner;
public class Exercise2 {

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str=scanner.next();
    System.out.print(getImage(str,scanner));
	}
	private static String getImage(String str,Scanner scanner)
	{
		StringBuilder st = new StringBuilder(str);
		StringBuilder rev=st.reverse();
		rev=st.append("|"+rev);
		return rev.toString();
		
	}

}