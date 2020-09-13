package com.github.perschola;

class OneToFive2 implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName().toString());
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}

public class Part22 {
	public static void main(String[] args) throws InterruptedException {
		Runnable r = new OneToFive3();
		Thread[] threadArr = new Thread[3];
		for (int i = 0; i < threadArr.length; i++) {
			threadArr[i] = new Thread(r);
			threadArr[i].start();
			if (i == 0) {
				threadArr[i].join();
			}
		}
	}
}
