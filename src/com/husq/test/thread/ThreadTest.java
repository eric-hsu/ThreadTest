package com.husq.test.thread;

public class ThreadTest extends Thread {
	private static int ticketCount = 5;//一共有5张火车票
	private String name;
	
	public ThreadTest(String name) {
		this.name= name;
	}

	@Override
	public void run() {
		while(ticketCount>0){
			ticketCount--;				//如果还有票就卖掉一张
			System.out.println(name+"卖了一张票，剩余票数为："+ticketCount);
		}
	}

}
