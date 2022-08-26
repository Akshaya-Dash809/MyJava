package Object;

public class EmployeeObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employee e1=new Employee("John","Paul",12300.90);
		System.out.println("Yearly salary for first employee "+e1.YearlySal());
		System.out.println("Yearly salary after giving 10% raise "+ e1.YearlySal()+ 0.1*e1.YearlySal());
	    
		Employee e2=new Employee("Rohan","Malhotra",45000.789);
		System.out.println("Yearly salary for second employee "+e2.YearlySal());
		System.out.println("Yearly salary after giving 10% raise "+ e2.YearlySal()+ 0.1*e2.YearlySal());
	    
		
	}

}
