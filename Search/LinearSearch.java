import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LinearSearch
{
 
    public static void main(String args[]) throws IOException
    {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter numbers:");
        String in[] = br.readLine().split("\\s+");
        int arr[] = new int[in.length];
        for(int i=0;i<in.length;i++) arr[i] = Integer.parseInt(in[i]);

        System.out.println("Enter target: ");
        int x = Integer.parseInt(br.readLine());

        int res = -1;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == x){
                res = i;
                break;
            }
                
        }

        
        if (res == -1)
            System.out.print("Element is not present in array");
        else
            System.out.print("Element is present at index: "+ res);
    }
}