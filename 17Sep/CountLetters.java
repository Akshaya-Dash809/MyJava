//WAP to count the number of letters in a file

package lab_17Sep;
import java.io.FileInputStream;
import java.io.IOException;

public class CountLetters {
	public static void main(String[] args) throws IOException{
	FileInputStream fi=new FileInputStream("test.txt");
	String s= fi.toString();
	int count = 0;
	for(int i = 0; i < s.length(); i++) {    
        if(s.charAt(i) != ' ')    
            count++; 
	}
    System.out.println("The no.s of letters in this file is  "+count);
	fi.close();
}
}
