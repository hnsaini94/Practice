/*This programs take two inputs:
	1. Input as array(array can be of any length, numbers seperated with spaces).
	2. Target number.
  The program will find two closest numbers to the target number from the array input.*/
import java.util.Scanner;

public class closestnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int frs,sec;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the array");
		String s= scan.nextLine();		// As user can enter any length input, it is saved as string
		
		String[] ch= s.split(" ");		//Here the string is splitted into substrings
		int[] arr= new int[ch.length];
		for(int i=0;i<ch.length;i++)
			arr[i]= Integer.parseInt(ch[i]);//Here the substrings are parsed to int
		System.out.println("Enter Target");
		int t= scan.nextInt();	
		
		frs=(arr[0]<arr[1])?arr[0]:arr[1];
		sec=(arr[0]<arr[1])?arr[1]:arr[0];
		for(int i=2;i<arr.length;i++){
			if(Math.abs(t-arr[i])<=Math.abs(t-frs))
			{
				sec=frs;
				frs=arr[i];
			}
			else if(Math.abs(t-arr[i])<=Math.abs(t-sec)){
				sec=arr[i];
			}
		}
		scan.close();
		System.out.println("First Number="frs + " " +"Second Number+" sec);
	}

}
