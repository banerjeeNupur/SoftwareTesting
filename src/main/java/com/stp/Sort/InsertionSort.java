package com.stp.Sort;

// Implementation of Insertion Sort

public class InsertionSort {
	
	public int[] insertionsort(int [] arr)
	{
        int n = arr.length;
		if(n==0)
			return null;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}

		System.out.println("Result: ");
        for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

        return arr;
	}
}
