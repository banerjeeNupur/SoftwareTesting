package Sort;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Implementation of Counting Sort
class CountingSort {
	
	public static void main(String args[]) throws IOException
	{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split("\\s+");
        char arr[] = new char[s.length];

        for (int i = 0; i < s.length; i++) {
            arr[i] = s[i].charAt(0);
        }

        int n = arr.length;

        // The output character array that will have sorted arr
		char output[] = new char[n];

		// Create a count array to store count of individual
		// characters and initialize count array as 0
		int count[] = new int[256];
		for (int i = 0; i < 256; ++i)
			count[i] = 0;

		// store count of each character
		for (int i = 0; i < n; ++i)
			++count[arr[i]];

		// Change count[i] so that count[i] now contains actual
		// position of this character in output array
		for (int i = 1; i <= 255; ++i)
			count[i] += count[i - 1];

		// Build the output character array
		// To make it stable we are operating in reverse order.
		for (int i = n - 1; i >= 0; i--) {
			output[count[arr[i]] - 1] = arr[i];
			--count[arr[i]];
		}

		// Copy the output array to arr, so that arr now
		// contains sorted characters
		for (int i = 0; i < n; ++i)
			arr[i] = output[i];

		
		System.out.print("Sorted character array is ");
		for (int i = 0; i < arr.length; ++i)
			System.out.print(arr[i]);
	}
}

