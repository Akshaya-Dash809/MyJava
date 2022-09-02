//Write a java program to input 5 elements of an array and search for a number whether it is present in an array or not. If present print its position in the array.

package lab_02Sep;
import java.util.*;

public class Input5 {
	public static void main(String[] args) 
    {
        int n, x, check = 0, i = 0;
        Scanner s = new Scanner(System.in);
        n=5;
        int a[] = new int[5];
        System.out.println("Enter 5  elements:");
        for(i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.print("Search a number you want :");
        x = s.nextInt();
        for(i = 0; i < n; i++)
        {
            if(a[i] == x)
            {
                check = 1;
                break;
            }
            else
            {
                check = 0;
            }
        }
        if(check == 1)
        {
            System.out.println("Element found at position:"+(i + 1));
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}
