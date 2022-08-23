package com.Lab;

public class Lab1 {
	public static void main(String args[])
	{
	/* 1
	boolean b = true;
	b++;
	System.out.println(); // Can't convert boolean into int
	*/
 
		/* 2
		int i=1, j=2, k=3;
        
        int m = i-- - j-- - k--;
         
        System.out.println("i="+i); //0
        System.out.println("j="+j); //1
        System.out.println("k="+k); //2
        System.out.println("m="+m); //-4 */
		
		/* 3 
		int a=1, b=2;
	         
	    System.out.println(--b - ++a + ++b - --a); //0 */
		
		  
		/* 4
		    int i=19, j=29, k;
         
	        k = i-- - i++ + --j - ++j + --i - j-- + ++i - j++;
	         
	        System.out.println("i="+i); //19
	        System.out.println("j="+j); //29
	        System.out.println("k="+k); //20 */
	        
		/* 5
		    int i = 11;
         
	        int j = --(i++); //error */
	        
		  /* 6
		    int m = 0, n = 0;
	         
	        int p = --m * --n * n-- * m--;
	         
	        System.out.println(p); // 1           */
		
	    	/* 7
		   int a=1;
         
	        a = a++ + ++a * --a - a--;
	         
	        System.out.println(a); //5    */
		
		/*  8
		int m=1010, n=1010;
        
        System.out.println(m++ / ++n * n-- / --m); //0     */
		
		/* 9
		   int x = 001, y=010, z=100;
	         
	        int i = --x + y++ - z-- - --z + ++y - --x + y-- - --x;
	         
	        System.out.println("x="+x); //-2
	        System.out.println("y="+y); //9
	        System.out.println("z="+z); //98
	        System.out.println("i="+i); //-167     */
		
		
		/* 10.Write a java program to take radius and print area of circle
		 
		 
		int radius =5;
		float pie=3.14f;
		double area =pie * radius*radius;
		System.out.println("Area of the circle is "+area); //78.5     */
		
		/* 11.Write a Java program to convert temperature from Fahrenheit to Celsius degree.
		
		float fahrenheit,celsius;
		fahrenheit =50;
		celsius = ((fahrenheit-32)*5)/9;
		System.out.println(fahrenheit+" fahrenheit  ""in celsius is "+ celsius); //10.0     */
		
	/* 12.Write a Java program that takes a number in inches, converts it to meters.

		double inch,meter;
		inch = 100;
		meter = inch * 0.0254;
		System.out.println(inch+" inch is "+meter+" in meter"); //100.0inch is 2.54in meter  */
		
		
	        
}
}
