package Demo_assign;
import java.util.Scanner;
public class Unit_Cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Unit:");
				 int unit=sc.nextInt();
				 if(unit<100)
					 
				 {
					 ch=1.20;
					 
				 }
				 else if(unit>100 && unit<=300)
				 {
					 ch=2;
				 }
				 else
				 {
					 ch=3;
				 }
				 System.out.println("The charge of your unit:" +(unit*ch));

	}

}
