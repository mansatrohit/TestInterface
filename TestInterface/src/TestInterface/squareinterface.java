package TestInterface;
import java.util.Scanner;
public class squareinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     printno obj1 = new printno();
     squaretest obj2 = new squaretest();
     Scanner in = new Scanner(System.in);
     System.out.println("Enter The Number To Square:");
     int a = in.nextInt();
     obj1.squareno(a);
     obj2.squareno(a);
     }
}
