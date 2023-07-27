package thread;


public class B extends Thread{
	public B() {
		
	}

	public void run() {
		// TODO Auto-generated method stub
		for(long i=0;i<Long.MAX_VALUE;i++)
		{
			System.out.println("val="+i);	
		}
	}

	

}
