package exception;

public class fnl {
	public static void main(String args[]) {
		try {
			int a = 0;
			int b =1;
				int frac = a/b;
		}
			catch (ArithmeticException e)
			{
				System.out.println("in the catch block,exception" +e);
			}
			finally {
				System.out.println("inside finally block" );		
			}
}
}