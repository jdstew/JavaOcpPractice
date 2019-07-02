package studyArea;

public class UsingJoin {
	
	private int i = 1;
	
	class mythread implements Runnable {

		@Override
		public void run() {
			i =  i * -1;
		}
	}

	public static void main(String[] args) {
		UsingJoin uj = new UsingJoin();
		Thread[] x = new Thread[127];
		
		for (int i = 0; i < x.length; i++) {
			x[i] = new Thread(uj.new mythread());
			x[i].start();
		}
		
		// without joining the threads you will see inconsistent results
		// odd thread counts must produce -1, positive must produce 1
//		for (int i = 0; i < x.length; i++) {
//			try {
//				x[i].join();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}

		System.out.println(uj.i);

	}
}
