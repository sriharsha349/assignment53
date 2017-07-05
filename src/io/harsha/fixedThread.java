package io.harsha;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class fixedThread {

	public static void main(String[] args) {
		System.out.println("Main thread starts here..");
		
		
		ExecutorService execService = Executors.newFixedThreadPool(10);
		
		execService.execute(new LoopTaskA());
		execService.execute(new LoopTaskA());
		execService.execute(new LoopTaskA());
		execService.execute(new LoopTaskA());
		execService.execute(new LoopTaskA());
		execService.execute(new LoopTaskA());
		execService.execute(new LoopTaskA());
		execService.execute(new LoopTaskA());
		execService.execute(new LoopTaskA());
		execService.execute(new LoopTaskA());
		execService.shutdown();

		System.out.println("Main thread ends here");
		

	}

}

