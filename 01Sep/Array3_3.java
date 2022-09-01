//2. WAP to input an array having 3 rows and 3 columns of type String.
package lab_01Sep;

import java.util.*;

public class Array3_3 {

		public static void main(String args[]) {
			
			String s[][]=new String[3][3];
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++)
			{
			Scanner sc=new Scanner(System.in);
			System.out.println("Input Strings ");
			String str=sc.next();
			s[i][j]=str;
			}
			}
			    for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++)
				System.out.println("s["+i+"]["+j+"]="+s[i][j]);
			}
			}
			}

