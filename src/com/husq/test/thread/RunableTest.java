package com.husq.test.thread;

public class RunableTest implements Runnable {
	private int ticketCount = 5; //一共有5张火车票

	@Override
	public void run() {
		while(ticketCount>0){
			ticketCount--;				//如果还有票就卖掉一张
			System.out.println(Thread.currentThread().getName()+"卖了一张票，剩余票数为："+ticketCount);
		}
	}
}
