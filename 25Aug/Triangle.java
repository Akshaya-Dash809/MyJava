//Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor.

package Object;

public class Triangle {
    
	
	int a =3;
	int b =4;
	int c =5;

  double area() {
	return (b*c)/2;
}
  int per() {
	  int p = a+b+c;
	  return p;
  }
}
