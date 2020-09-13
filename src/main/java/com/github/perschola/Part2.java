package com.github.perschola;
class OneToFive extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Part2 {
	public static void main(String[] args) {
		OneToFive otf1 = new OneToFive();
		OneToFive otf2 = new OneToFive();
		
		otf1.start();
		otf2.start();
		
	}
}
