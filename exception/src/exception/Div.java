package exception;

public class Div {
	public static void main(String args[])
	{
		int a = 0;
		int b =40;
		try {
			int frac = a/b;
			System.out.println("result:" +frac);
		}
		catch (ArithmeticException e)
		{
			System.out.println("cant be divided by zero" +e);
		}
		
		
	}

}
