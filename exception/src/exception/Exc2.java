package exception;
import java.util.Scanner;
public class Exc2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter a num,a:");
		int a;
		try {
			a = sc.nextInt();
		}
		catch(Exception e) {
			System.out.println("Invalid num");
			a=0;
		}
	}

}
