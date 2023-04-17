package Demo_assign;
import java.util.Scanner;
public class Group 
		{
			public static void main(String args[])
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the RollNo:");
				int roll=sc.nextInt();
				if(roll%2==0)
				{
					if (roll%4==0)
				
					System.out.println("Emerald Group");
				else
					System.out.println("perl Group");
				}
				else
				{
					if(roll%4==3)
						System.out.println("Rubby Group");
					else if(roll==1 || roll%4==1)
						System.out.println("Sapphire Group");
				}
			}
	        

         }
