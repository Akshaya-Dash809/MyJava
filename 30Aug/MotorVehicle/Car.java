package lab_30Aug;

public class Car extends MotorVehicle {

	double discountRate;
	String car_name;
	public Car(String cn,double dr) {
		super("model1",10,55000);
		this.discountRate=dr;
		this.car_name=cn;
	}
	void display() {
		System.out.println(car_name+" "+modelNumber+" "+modelPrice+" "+discountRate);
	}
	double discount() {
		return modelPrice-discountRate*modelPrice;
	}
}
