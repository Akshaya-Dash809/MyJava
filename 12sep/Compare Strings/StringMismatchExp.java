/*
Write a program to throw a user-defined exception "String Mismatch Exception", if
two strings are not equal (ignore the case).
*/

package lab_12Sep;

public class StringMismatchExp extends Exception {
	 StringMismatchExp(String msg){
		 super(msg);
	 }
}


