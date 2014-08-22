/** 
* 2014-7-7 下午8:18:43
* quickSort.java 
* author:aimenlianhua 
* function：快排
*/ 
package sort;

public class quickSort {
	public static void qsort_asc(int source[], int low, int high){
		int i,j,x;
		if(low <high){
			i = low;
			j = high;
			x = source[i];
			while (i < j) {
				while (i < j && source[j] > x) {
					j--;
				}
				if (i<j) {
					source[i] = source[j];
					i++;
				}
				while (i < j && source[i] < x) {
					i++;
				}
				if(i<j){
					source[j] = source[i];
					j--;
				}

			}
			source[i] = x;
			for (int k = 0; k <10; k++) {
				System.out.printf("%d",source[k]);
				
			}
			System.out.println();
			qsort_asc(source, low, i-1);
			qsort_asc(source, i+1, high);
		}

	}
	
	public static void main(String[] args) {
		int[]  a = {4,2,1,6,3,6,0,-5,1,1};
		for (int j = 0; j <10; j++) {
			System.out.printf("%d",a[j]);
		}
		System.out.println();
		qsort_asc(a, 0, a.length-1);
		for (int j = 0; j <10; j++) {
			System.out.printf("%d",a[j]);
		}
	}
}

