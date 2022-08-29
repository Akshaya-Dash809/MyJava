package lab_26Aug;

public class Account {

	long ID = 0;
	double balance = 0.0;
	double annualInterestRate= 0.0;
	String dateCreated= null;

	Account(){
		this.ID = ID;
		this.balance = balance;
		this.annualInterestRate =  annualInterestRate;
		this.dateCreated = dateCreated;	
	}
	
	Account(long id,double bal){
		id = 123456;
		bal = 10000;
		
	}

	double getMonthlyInterestRate() {
		
		double interestRate = this.annualInterestRate/12;
		return interestRate;
	 }
	double getMonthlyInterest() {
		
		double interest = (this.balance * this.annualInterestRate/12 * 1)/(100);
		return interest;
		
	}
	double withdraw(double withdrawAmount) {
		
		return withdrawAmount;
	}

	double deposite(double depositeAmount) {
		
		return depositeAmount; 
	}

	

}
