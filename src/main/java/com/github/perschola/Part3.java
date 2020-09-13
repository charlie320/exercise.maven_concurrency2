package com.github.perschola;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class OneToFive3 implements Runnable {

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

public class Part3 {
	public static void main(String[] args) throws InterruptedException {
		Runnable r = new OneToFive2();
		Thread[] threadArr = new Thread[3];
		List<String> names = Arrays.asList("First", "Second", "Third");
		Iterator<String> nameFactory = names.iterator();
		
		for (int i = 0; i < threadArr.length; i++) {
			threadArr[i] = new Thread(r);
			threadArr[i].setName("My " + nameFactory.next() + " Thread");
			threadArr[i].start();
			if (i == 0) {
				threadArr[i].join();
			}
		}
	}
}
