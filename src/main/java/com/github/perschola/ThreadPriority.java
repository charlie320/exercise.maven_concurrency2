package com.github.perschola;

class PrintThreads implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <  3; i++) {
			System.out.println("Running thread name is " +  Thread.currentThread().getName());
			System.out.println("Running thread priority is " + Thread.currentThread().getPriority());
			System.out.println("============================================");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadPriority {
	
	public static void main(String[] args) {
		Runnable r = new PrintThreads();
		Thread tOne = new Thread(r);
		tOne.setPriority(Thread.MIN_PRIORITY);
		Thread tTwo = new Thread(r);
		tTwo.setPriority(Thread.NORM_PRIORITY);
		Thread tThree = new Thread(r);
		tThree.setPriority(Thread.MAX_PRIORITY);
		tOne.start();
		tTwo.start();
		tThree.start();
	}
}
