package Demo_assign;
import java.util.Scanner;
public class Number_of_Passanger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p=0,totalPassn=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row:");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++)
		{
	       System.out.println("Enter the total passenger in row"+i+":");
	       p=sc.nextInt();
	       totalPassn+=p;
		}
		System.out.println("Total no of row is: "+row+"  and total No of Passenger is"+totalPassn);

	}

}
