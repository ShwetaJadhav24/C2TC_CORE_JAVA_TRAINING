package practice;

public class Multi_Thread {

	public static void main(String[] args) throws InterruptedException
	{
	
       MyThread t=new MyThread();
       
       t.start();
       t.join(); //main thread is invoking
       for(int i=0; i<10; i++)
       {
    	   System.out.println("Main Thread");
       }
	}

}

class MyThread extends Thread //run()
{

    public void run()
{
    	
    	for(int i=0; i<10; i++)
    	{
    		System.out.println("Child thread.....");
    	}
    	
    	try
    	{
             Thread.sleep(5000);
    	}
    	catch(InterruptedException e) {
    	
    	}
}
}
    	