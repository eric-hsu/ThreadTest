package com.husq.test.thread;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class DaemonTest implements Runnable{

	@Override
	public void run() {
		System.out.println("进入守护线程"+Thread.currentThread().getName());
		try {
			writeFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("结束守护线程"+Thread.currentThread().getName());
	}

	public void writeFile()throws Exception{
		File fileName = new File("d:"+File.separator+"daemon.txt");
		OutputStream os = new FileOutputStream(fileName);
		int count=0;
		while(count<999){
			os.write(("\r\nword"+count).getBytes());
			System.out.println("守护线程"+Thread.currentThread().getName()+"向文件中写入了word"+count++);
			Thread.sleep(1000);
		}
	}
}
