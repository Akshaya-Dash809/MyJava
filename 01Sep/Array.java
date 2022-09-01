//1. WAP to input an array having 5 strings and display them.
package lab_01Sep;
import java.util.*;

public class Array {
	
	     	public static void main(String args[]) {
			
			String s[]=new String[5];
			Scanner sc=new Scanner(System.in);
			
			for(int i=0;i<5;i++)
			{
				System.out.println("input 5 strings ");
				String st=sc.next();
			s[i]=st;
			}
			for(int i=0;i<5;i++) {
			System.out.println("st["+i+"]="+s[i]);
		}
		}
	}