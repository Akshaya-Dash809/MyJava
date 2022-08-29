package lab_26Aug;
import java.util.*;

public class AccountObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
		Account acc = new Account();
		System.out.println("Enter the id number : ");
		acc.ID = sc.nextInt();

		System.out.println("Enter the balace of the account : ");
		acc.balance = sc.nextInt();
		
		System.out.println("Enter the current annual interest rate : ");
		 acc.annualInterestRate = sc.nextDouble();
		
		System.out.println("Enter the  account created date : ");
    	 acc.dateCreated = sc.next();
		
		System.out.println("Enter the withdraw amount : ");
		double withdrawAmount = sc.nextDouble();
		
		System.out.println("Enter the deposite amount : ");
		double depositAmount = sc.nextDouble();
		
		double inter = acc.getMonthlyInterest();
		double total = acc.balance+depositAmount-withdrawAmount-inter;
		
		 System.out.println("Monthly interest rate is : "+ acc.getMonthlyInterestRate());
		 
		 System.out.println("Monthly interest amount is : "+ acc.getMonthlyInterest());
		 
		 System.out.println("date of the account create is : "+ acc.dateCreated);
		 
		 System.out.println("Monthly withdraw amount is : "+ acc.withdraw(withdrawAmount));
		 
		 System.out.println("Monthly deposite amount is : "+ acc.deposite(depositAmount));
		
		 System.out.println("The total amount after deduced = " + total);
	
	}

}
