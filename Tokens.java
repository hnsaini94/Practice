/* Given a string, , matching the regular expression [A-Za-z !,?._'@]+, 
split the string into tokens. We define a token to be one or more consecutive English alphabetic letters.
Then, print the number of tokens, followed by each token on a new line. */
import java.util.Scanner;

public class Tokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		String s=scan.nextLine();		// Take input from the keyboard
		s=s.trim();				// Remove spaces at the beginning and end of the string
		String[] part=s.split("[ .,?_!@']+");	//Split the string using REGEX
		for(int i=0;i<part.length;i++)
		System.out.println(part[i]);		// Print the splitted String
		scan.close();
	}

}
