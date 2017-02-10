import java.util.Scanner;

public class closestnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int frs,sec;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the array");
		String s= scan.nextLine();
		String[] ch= s.split(" ");
		int[] arr= new int[ch.length];
		for(int i=0;i<ch.length;i++)
			arr[i]= Integer.parseInt(ch[i]);
		System.out.println("Enter Target");
		int t= scan.nextInt();
		frs=arr[0];
		sec=arr[1];
		for(int i=2;i<arr.length;i++){
			if(Math.abs(t-arr[i])<=Math.abs(t-frs))
			{
				sec=(sec<frs)?sec:frs;
				frs=arr[i];
			}
			else if(Math.abs(t-arr[i])<=Math.abs(t-sec)){
				sec=arr[i];
			}
		}
		scan.close();
		System.out.println(frs + " " + sec);
	}

}
