package com.jspiders.multithreading.thread;

public class MyThread11 extends Thread{
	
	
	@Override
	public void run() {
		String message = "Java is a programming language";
		char[] chararray = message.toCharArray();
		for(int i = 0;i<chararray.length;i++) {
			System.out.print(chararray[i]);
			try {
				Thread.sleep(100);
			}
			
			catch(InterruptedException e) {
				    e.printStackTrace();
				
			}
			
		}
	}

}
