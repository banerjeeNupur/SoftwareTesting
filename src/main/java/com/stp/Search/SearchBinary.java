package com.stp.Search;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Iterative Binary Search
// Returns index of x if it is present in arr[]

public class SearchBinary {
	
	public int binarysearch (int arr[], int x)
	{
        int l = 0, r = arr.length - 1, res=-1;
		while (l <= r) {
			int m = l + (r - l) / 2;
			if (arr[m] == x){
                res =  m;
                break;
            }
			if (arr[m] < x)
				l = m + 1;
			else
				r = m - 1;
		}
		System.out.println("Result: ");
		return res;
	}
}
