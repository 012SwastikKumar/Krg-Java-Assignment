import java.util.*;
import java.io.*;

class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    double b = sc.nextDouble();
	    sc.nextLine();// this needs to be in code as it will take the buffer enter after giving input to b
	    String c = sc.nextLine();
	    
	    System.out.println("String : "+c);
	    System.out.println("Double : "+b);
	    System.out.println("Integer : "+a);	    
	}
}