package Unit_03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class P16_Multithreading {
		public static void main(String[] args)
		{
			
			MultiThreadingInJava obj = new MultiThreadingInJava();
			obj.threadConcept();
			obj.threadSynchronization();
			obj.interThreadCommunication();
			obj.ProducerConsumerProblems();
			obj.Wait_And_Notify();
			c1 obj1=new c1();
			c2 obj2=new c2();
			obj1.show1();
			obj2.show2();
			//T1
		}
}


class MultiThreadingInJava
{
	void threadConcept()
	{
		
	}
	
	void threadSynchronization()
	{
		
	}
	
	void interThreadCommunication()
	{
		
	}
	
	void ProducerConsumerProblems()
	{
		
	}
	
	void Wait_And_Notify()
	{
		
	}
}
class c1
{
	void show1()
	{
		try{Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
				System.out.println(a);
		
	}
	catch(Exception e) {
		System.out.println("done"+ e.getMessage());
	}
	}
}
class c2
{
	void show2()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("hey-2");
		}
	}
}
class T1 extends Thread{
	public void run()
	{
		Scanner sc= new Scanner(System.in);
		int r=sc.nextInt();
				System.out.println(r);
		
	}
	
	class T2 extends Thread
	{
		public void run()
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("hey-2");
			}
		}
	}
	
}