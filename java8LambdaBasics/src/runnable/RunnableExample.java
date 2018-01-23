package runnable;

public class RunnableExample {

	public static void main(String[] args) {
	
		//annonimous innerClass
		Thread myThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Printed inside runnable");
				
			}
		});
		
		myThread.run();
		
		Thread myLambdaThread = new Thread( () -> System.out.println("Printed inside lambda runnable" ));
		myLambdaThread.run();
	}
}
