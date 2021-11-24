package Sort;
import java.io.*;

// Implementation of Insertion Sort
class InsertionSort {
	
	public static void main(String args[]) throws IOException
	{
        System.out.println("Enter numbers : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s [] = br.readLine().split("\\s+");
        int arr[] = new int[s.length];

        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
		

        int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}

        for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

	}
}
