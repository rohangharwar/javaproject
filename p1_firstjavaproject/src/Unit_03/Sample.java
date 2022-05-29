package Unit_03;

import java.util.InputMismatchException;

public class Sample {
	public static void main(String[]args)
	{
		try{
			int a=100/0;
			System.out.println(a);
			
		}
		catch(InputMismatchException e)
		{
			System.out.println("Exception"+e.getMessage());
		}
//		catch(Exception e)
//		{
//			System.out.println("Exception"+e.getMessage());
//		}
//if there is no exception finally always run.
//if there is ecxeption funally can run.
//if there is exception in try block and we dont't have appropriate catch block still finally always run.   
		finally {
		System.out.println("done!!");
		}
	}

}
