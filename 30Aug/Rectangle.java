package lab_30Aug;

public class Rectangle {
int length;
int breadth;
int side;

      Rectangle(int length,int breadth){
	  this.length=10;
	  this.breadth=5;
	  this.side=10;
  }
  double area_rectangle() {
	double  area = length * breadth;
	return area;
  }
  double perimeter_rectangle() {
	  double peri = 2*(length +breadth);
	  return peri;
  }
  double area_square() {
	  double ar = side*side;
	  return ar;
  }
  double perimeter_square() {
	  double per = 4*side;
	  return per;
  }
}
