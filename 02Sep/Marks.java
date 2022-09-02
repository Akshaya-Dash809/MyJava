//Write a program to print the roll number and average marks of 8 students in three subjects (each out of 100). The marks are entered by user.
package lab_02Sep;
import java.util.*;
public class Marks {


public static void main(String[] args) {

String rollNo;

double mth,eng,sc;


Scanner s = new Scanner(System.in);

for(int i=1; i<=8; i++){
System.out.print(" Roll Number: ");
rollNo = s.next();

System.out.print("First Subject Mark: ");
mth = s.nextFloat();
System.out.print("Second Subject Mark: ");
eng = s.nextFloat();
System.out.print("Third Subject Mark: ");
sc = s.nextFloat();


double avg = mth+eng+sc/3;
if(mth<=100 && eng<=100 && sc<=100){


System.out.println("Roll Number: "+rollNo);
System.out.println("Average Marks : "+avg);

}
else{
System.out.println("Please Enter Your Marks Between 0 to 100");
}
}
}

}


