import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Iterative Binary Search
// Returns index of x if it is present in arr[]

class BinarySearch {
	
	public static void main(String args[]) throws IOException
	{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter numbers:");
        String in[] = br.readLine().split("\\s+");
        int arr[] = new int[in.length];
        for(int i=0;i<in.length;i++) arr[i] = Integer.parseInt(in[i]);

        System.out.println("Enter target: ");
        int x = Integer.parseInt(br.readLine());
		
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

		if (res == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index: " + res);
	}
}
