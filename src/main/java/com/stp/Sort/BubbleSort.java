package com.stp.Sort;
import java.io.*;
 
// Implementation of Bubble Sort

class BubbleSort
{

    public void bubblesort() throws IOException
    {

        System.out.println("Enter numbers : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s [] = br.readLine().split("\\s+");
        int arr[] = new int[s.length];

        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        int n = arr.length;
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++)
        {
            swapped = false;
            for (j = 0; j < n - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
 
            if (swapped == false)
                break;
        }
        System.out.println("Sorted array: ");

        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

    }
}
 