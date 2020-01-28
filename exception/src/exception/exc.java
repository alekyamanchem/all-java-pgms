package exception;

public class exc {
	public static void main(String args[])
	{
		try {
			int n[] = new int[10];
			
			System.out.println("accessig d element:" +n[2]);
			}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception thrown:" +e);
		}
		
	}
}
