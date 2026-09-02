package com.tnsit.multithreadingprograms;

class Sleep extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("sleep id"+" :"+Thread.currentThread().getId());
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class SleepMethod {
	public static void main(String[] args) {
		Sleep s=new Sleep();
		s.start();
	}

}
