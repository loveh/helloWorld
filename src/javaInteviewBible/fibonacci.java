/** 
* 2014-7-5 下午4:55:37
* fibonacci.java 
* author:aimenlianhua 
* function：斐波那契数列的第n项是什么
*/ 
package javaInteviewBible;

import java.util.Scanner;

public class fibonacci {
	public static int k = 0;
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		long a = cinScanner.nextLong();
		System.out.println(fibonacci(a));
		System.out.println("共调用了" + k + "次");
	}
	public static long fibonacci(long m) {
		if(m==0||m==1){
			k++;
			return m;
		}
		else {
			return fibonacci(m-1)+fibonacci(m-2);//递归
		}
	}
}

