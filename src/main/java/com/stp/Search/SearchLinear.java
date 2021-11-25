package com.stp.Search;

public class SearchLinear
{
 
    public int linearsearch(int arr[], int x)
    {

        int res = -1;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == x){
                res = i;
                break;
            }
                
        }

        System.out.println("Result: "+res);
        return res;
    }
}
