/** 
* 2014-7-5 下午3:25:46
* PrintResult.java 
* author:aimenlianhua 
* function：从键盘键入两个整数，输出平方值机立方值
*/ 
package javaInteviewBible;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintResult {
	public static void main(String[] args) {
		Result result = new Result();
		System.out.println("请输入一个整数：　");
		int a = InputData.getInt();
		result.print(a);
	}
}

class InputData{
	static private String string = "";
	static public void input(){
		BufferedReader bufferedReader  = new BufferedReader(
				new InputStreamReader(System.in)
				);
		try {
			string = bufferedReader.readLine();
		} catch (IOException e) {
			// TODO: handle exception
		}	
	}
	static public int getInt(){
		input();
		return Integer.parseInt(string);
	}
}

class Result {
	void print(int d){
		System.out.println(d + "的平方是" + d*d);
		System.out.println(d + "的立方是" + d*d*d);
	}
}

