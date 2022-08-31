package lab_30Aug;

public abstract class MotorVehicle {

	String modelName;
	int modelNumber;
	double modelPrice;
	
	MotorVehicle(String mn,int mno,double mp){
		this.modelName=mn;
		this.modelNumber=mno;
		this.modelPrice=mp;
	}
	abstract void display();
}
