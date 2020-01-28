package exception;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exc1 {
	public static void main(String args[]) {
		try {
			
		int n=20;
		int a;
		System.out.println("Enter a num,a:");
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		input.close();
		
			System.out.println("Valid num");
		}
			catch (InputMismatchException e)
			{
				System.out.println("inValid num");
			}

}
}
