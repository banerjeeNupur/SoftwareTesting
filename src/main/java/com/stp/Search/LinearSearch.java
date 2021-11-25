package com.stp.Search;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LinearSearch
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

        return res;
    }
}
