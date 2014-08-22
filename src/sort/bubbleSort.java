/** 
* 2014-7-7 下午8:07:55
* bubbleSort.java 
* author:aimenlianhua 
* function：冒泡排序
*/ 
package sort;

public class bubbleSort {
	public static void bubbleSort(int[] source){
		for (int i = source.length-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (source[j] > source[j+1]) {
					swap(source, j, j+1);
				}
			}
		}
	}
	
	private static void swap(int[] source, int x, int y) {
		int temp = source[x];
		source[x] = source[y];
		source[y] = temp;
	}
	
	public static void main(String[] args) {
		int []a = {4,2,1,6,3,6,0,-5,1,1};
		int i;
		bubbleSort(a);
		for (i = 0; i < a.length; i++) {
			System.out.printf("%d ",a[i]);
		}
	}
		
}

