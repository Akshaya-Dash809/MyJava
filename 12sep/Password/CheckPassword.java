package lab_12Sep;
import java.util.*;

public class CheckPassword {

		public static void main(String args[])
		{
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.println("Enter Password : ");
		if(sc.nextLine().equals("Akshaya123"))
		{
		System.out.println("Authenticated ");
		}
		else
		{
		throw new PasswordException("Authentication failure");
		}
		}
		catch(PasswordException e)
		{
		System.out.println(e);
		}
		}
		}


