package com.tnsit.multithreadingprograms;

class MyTask extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName()+" :"+Thread.currentThread().getPriority());
	}
	
}
public class Prioritydemo {
	public static void main(String[] args) {
		MyTask t1=new MyTask();
	    MyTask t2=new MyTask();
	    MyTask t3=new MyTask();
	    
	    
	    t1.setName("Background Task");
	    t2.setName("Normal Task");
	    t3.setName("Important Task");
	    
	    t1.setPriority(1);
	    t2.setPriority(3);
	    t3.setPriority(8);
	    
	    t1.start();
	    t2.start();
	    t3.start();
	    
	    
	}

}
