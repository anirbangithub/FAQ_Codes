package sorting_algos;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = { 89, 4, 1, 99,99, 2, 8, 9, 7 };
		doInsertionSort(ar);
		System.out.println("sorted array---" + Arrays.toString(ar));
	}

	public static void doInsertionSort(	int[] arr) {
		int j,key;
		for(int i =0;i<arr.length;++i) {
			
			key =arr[i];
			j = i-1;
			while(j>=0 && arr[j]>key) {
			//	System.out.println("arr[j]::"+arr[j]);
				arr[j+1] =arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}

}
