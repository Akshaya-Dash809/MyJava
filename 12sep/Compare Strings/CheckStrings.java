package lab_12Sep;
import java.util.*;

import java.util.Scanner;

public class CheckStrings {

	public static void main(String args[]) throws StringMismatchExp {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String");
        String str=sc.next();
        System.out.print("Enter the above String:");
        String st=sc.next();
	   try {
		if (str.equals(st)) {
			System.out.println("The entered string is  equal to the given string");
		}else {
			throw new  StringMismatchExp("The entered string is not equal to the given string");
		}
		
     	}
	   catch ( StringMismatchExp e) {
		System.out.println(e.getMessage());
	    }
       }
      }

