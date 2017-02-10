import java.util.Scanner;

public class Voters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		String s=scan.nextLine();
		s=s.trim();
		String[] part=s.split("[ .,?!@']+");
		for(int i=0;i<part.length;i++)
		System.out.println(part[i]);
		scan.close();
	}

}
