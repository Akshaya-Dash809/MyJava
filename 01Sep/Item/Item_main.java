package lab_01Sep;
import java.util.*;
public class Item_main {

	 public static void main(String args[])
	  {
		 Item it= new Item("A12345",1000);
		 
	    Item[] I = new Item[5];
	    String a;
	    int b,total_cost=0;
	   Scanner sc = new Scanner(System.in);
	    
	    for(int i=0;i<5;i++) {
	      
	      System.out.print("Enter code  for item"+(i+1)+" : ");
	      a = sc.nextLine();
	      System.out.print("Enter price for item"+(i+1)+" : ");
	      b = sc.nextInt();
	      I[i] = new Item(a,b);
	    }
	    
	    System.out.println("Item Code Item Price");
	    System.out.println("--------- ----------");
	    for(int i=0;i<5;i++)
	    {
	      System.out.print(I[i].code);
	      System.out.println(I[i].price);
	      total_cost = total_cost + I[i].price;
	    }
	    System.out.print("Total Price = "+total_cost);
	  }
}
