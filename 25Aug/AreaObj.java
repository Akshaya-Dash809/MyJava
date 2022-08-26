package Object;
import java.util.*;
public class AreaObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Area ar = new Area();
		System.out.println("Enter the length");
		int len = sc.nextInt();
		System.out.println("Enter the breadth");
		int brt=sc.nextInt();
		ar.setDim(len, brt);
		int result =  ar.getArea();
		System.out.println("The area is "+result);
	}

}
