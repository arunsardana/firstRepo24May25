package executorPrac;

public class NumberPrinter implements Runnable {

	int n;
	 NumberPrinter(int n) {
		// TODO Auto-generated constructor stub
		 this.n=n;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(n+" "+Thread.currentThread().getName());
		//changes feature1
		//changes  2 added in feature1
		//changes 1 in feature 2
		
	}

}
