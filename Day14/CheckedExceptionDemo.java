package Day14;

public class CheckedExceptionDemo {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Program is started..");
		System.out.println("Program is in progress..");
		
		/*try
		{
			Thread.sleep(6000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}*/
		//or throws method, throws Syntax added in main string
		Thread.sleep(4000);
		
		System.out.println("Program Is Finished..");
        System.out.println("Program Is Terminated..");

	}

}
