package com.stp.Sort;

// Implementation of Bubble Sort

public class BubbleSort
{

    public int[] bubblesort(int [] arr)
    {

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
        System.out.println("Result: ");

        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        return arr;

    }
}
 