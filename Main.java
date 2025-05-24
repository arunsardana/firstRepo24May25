package executorPrac;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		// TODO	gi Auto-generated method stub
	
		ExecutorService es = Executors.newFixedThreadPool(5);
		for(int i=1;i<100;i++) {
			NumberPrinter ob= new NumberPrinter(i);
			es.execute(ob);
			//hey this is Arun
		}   

	}

}
