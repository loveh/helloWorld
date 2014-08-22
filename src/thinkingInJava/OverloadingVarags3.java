/** 
* 2014-8-12 下午8:11:18
* OverloadingVarags3.java 
* author:aimenlianhua 
* function：可变参数
*/ 
package thinkingInJava;

public class OverloadingVarags3 {
	static void f(float i, Character... args){
		System.out.print(args.getClass());
		System.out.println("length = " + args.length);
	}
	static void g(int...args){
		System.out.print(args.getClass());
		System.out.println(" length = " + args.length);
	}
	public static void main(String[] args) {
		f('a');
	}
}

