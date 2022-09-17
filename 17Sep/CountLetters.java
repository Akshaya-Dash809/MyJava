//WAP to count the number of letters in a file

package lab_17Sep;
import java.io.FileInputStream;
import java.io.IOException;

public class CountLetters {
	public static void main(String[] args) throws IOException{
	FileInputStream fi=new FileInputStream("test.txt");
	int i,count=0;
	while((i=fi.read())!=-1) {
		if(i!=' ') {
		count=count+1;
	}
	}
    System.out.println("The no.s of letters in this file is  "+count);
	
}
}
