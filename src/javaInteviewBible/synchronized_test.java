/** 
* 2014-7-15 下午8:23:15
* synchronized_test.java 
* author:aimenlianhua 
* function：一个电影院有20张票要买，利用synchronized避免重复卖票(如何让它停止捏？)
*/ 
package javaInteviewBible;

public class synchronized_test {
	public static void main(String[] args) {
		SellThread sellThread = new SellThread();
		Thread sell1 = new Thread(sellThread, "sellman1");
		Thread sell2 = new Thread(sellThread, "sellman2");
		Thread sell3 = new Thread(sellThread, "sellman3");
		sell1.start();
		sell2.start();
		sell3.start();
		
	}
}

class SellThread implements Runnable{
	private int i = 20;
	String aString = "now ok";
	
	public void run() {
		while (true) {
			synchronized (aString) {
				if (i  > 0) {
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
				System.out.println(Thread.currentThread().getName() + " sell " + i--);
			}
		}
	}
}

