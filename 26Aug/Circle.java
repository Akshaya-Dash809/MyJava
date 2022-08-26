/*Define a class called circle that contains:
 Two  instance variables: radius (of type double) and color (of type String),
 Initialize the variables radius and color with default value of 1.0 and "red", respectively
 using default constructor.
 Include a second constructor that will use the default value for color and sets the value of radius to the value passed as parameter.
 Two public methods: getRadius() and getArea() for returning the radius and area of the circle.     */


package lab_26Aug;

public class Circle {
double radius;
String color;
Circle(){
	radius=1.0;
	color="red";
}
	Circle(String s,double ra){
		this.color=color;
		this.radius=ra;
	}
	double getArea() {
	return 3.14*radius*radius;	
	}
	    double area = getArea();
	    double getRadius() {
		radius= Math.sqrt(area/3.14);
		return radius;
	}

}