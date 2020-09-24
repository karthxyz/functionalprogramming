package com.learning.functionalprograming.morefunctionalprogramming;

import java.util.stream.IntStream;

public class FP05Thread {

	public static void main(String[] args) {
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println(Thread.currentThread().getName() + " " + i);
				}

			}
		};
	
	Thread thread = new Thread(runnable);
	thread.start();
	
	Thread thread2 = new Thread(runnable);
	thread2.start();
	
	Thread thread3 = new Thread(runnable);
	thread3.start();
	
	Runnable runnable2 = () -> IntStream.range(0, 1001).forEach(i->System.out.println(Thread.currentThread().getName() + " " + i));
	
	Thread thread4 = new Thread(runnable2);
	thread4.start();
	
	Thread thread5 = new Thread(runnable2);
	thread5.start();
	
	Thread thread6 = new Thread(runnable2);
	thread6.start();
	}

}
