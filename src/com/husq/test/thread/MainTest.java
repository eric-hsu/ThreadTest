package com.husq.test.thread;

import java.util.Scanner;

public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//1,继承Thread抽象类
		/*ThreadTest thread1 = new ThreadTest("窗口一");
		ThreadTest thread2 = new ThreadTest("窗口二");
		ThreadTest thread3 = new ThreadTest("窗口三");
		
		thread1.start();
		thread2.start();
		thread3.start();*/
		
		//System.out.println("*********************************");
		
		//2,实现Runable接口
		RunableTest runable = new RunableTest();
		Thread rThread1 = new Thread(runable,"窗口1");
		Thread rThread2 = new Thread(runable,"窗口2");
		Thread rThread3 = new Thread(runable,"窗口3");
		
		rThread1.start();
		rThread2.start();
		rThread3.start();
		
		//System.out.println("*********************************");
		
		//3,守护线程
		/*System.out.println("进入主线程"+Thread.currentThread().getName());
		DaemonTest daemonTest = new DaemonTest();
		Thread thread = new Thread(daemonTest);
		thread.setDaemon(true);
		thread.start();
		
		Scanner sc = new Scanner(System.in);
		sc.next();
		
		System.out.println("结束主线程"+Thread.currentThread().getName());*/
		
		//jsp相关元素，指令，表达式，小脚本，声明，注释，静态内容
	}

}
