import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/** 
 * 2014-7-5 下午7:44:35
 * countRepeat.java 
 * author:aimenlianhua 
 * function：求出现次数最多的字母及次数
 */

public class countRepeat {
	public static void main(String[] args) {
		String input = "aavzcadfdsfsdhshgwasdfasdfdddaaa";
		new countRepeat().doString(input);
	}
	
	public void doString(String input){
		char[] chars = input.toCharArray();//将input转为数组
		ArrayList lists = new ArrayList();
		TreeSet set = new TreeSet();
		for (int i = 0; i < chars.length; i++) {
			lists.add(String.valueOf(chars[i]));
			set.add(String.valueOf(chars[i]));
		}
		System.out.println(set);
		Collections.sort(lists); //对lists排序
		System.out.println(lists);
		
		StringBuffer sBuffer = new StringBuffer();
		for (int i = 0; i < lists.size(); i++) {
			sBuffer.append(lists.get(i));
		}
		input = sBuffer.toString();//转为字符串
		System.out.println(input);
		int max = 0;
		String maxString = "";
		ArrayList maxlist = new ArrayList();
		
		Iterator its = set.iterator();//对 collection 进行迭代的迭代器。
		while (its.hasNext()) {
			String oString = (String) its.next();//强制转换？
			int begin = input.indexOf(oString);
			int end = input.lastIndexOf(oString);
			int value = end - begin + 1;
			if (value>max) {
				max = value;
				maxString = oString;
				maxlist.add(oString);
			}
		}
		int index = 0;
		for (int i = 0; i < maxlist.size(); i++) {
			if (maxlist.get(i).equals(maxString)) {
				index = i;
				break;
			}
		}
		System.out.println("max data");
		for (int i = index; i < maxlist.size(); i++) {
			System.out.println(maxlist.get(i) + " ");
		}
		System.out.println();
		System.out.println("max" + max);
	}
	
}

