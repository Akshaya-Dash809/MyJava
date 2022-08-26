/*Write a program to print the area of a rectangle by creating a class named 'Area' having two methods.
First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard. */

package Object;

public class Area {

	int l,b;
	void setDim(int length,int breadth) {
		// TODO Auto-generated method stub

		l=length;
		b=breadth;
	}
	int getArea() {
		return l*b;
	}

}
