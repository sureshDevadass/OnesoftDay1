
public class MultiThreadProgram extends Thread {

	public static void main(String[] args) {

		Thread t1 = new Thread(()->{
			for(int i=0;i<10;i++) {
				System.out.println("Thread 1 is Running");
			}
		});
		Thread t2 = new Thread(()->{
			for(int i=0;i<10;i++) {
				System.out.println("Thread 2 is Running");
			}
		});		
		Thread t3 = new Thread(()->{
			for(int i=0;i<10;i++) {
				System.out.println("Thread 3 is Running");
			}
		});
		t1.start();
		t2.start();
		t3.start();

	}

}
