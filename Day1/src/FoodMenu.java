import java.util.Scanner;
class FoodMenu
{

	public static void main(String[] args)
	{
		boolean done=false;
		int choice,qty;
		float price=0;
		Scanner sc=new Scanner(System.in);
		while(!done)
		{
			System.out.println("1.Dosa  Rs.10 \n 2.Idli  Rs.20 \n 3.Upma  Rs.25 \n 4.Generate Bill\n");
			System.out.println("Enter the choice");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1: 
					System.out.println("Enter the Quantity");
					qty=sc.nextInt();
					price=price+(10*qty);
				break;
				case 2: 
					System.out.println("Enter the Quantity");
					qty=sc.nextInt();
					price=price+(20*qty);
				break;		
				case 3: 
					System.out.println("Enter the Quantity");
					qty=sc.nextInt();
					price=price+(25*qty);
				break;
				case 4: 
					System.out.println("Generated Bill :");
					System.out.println("Total Price : "+price);
					done=true;
				break;
				default:
					System.out.println("Invalid Choice enter valid choice");
				break;					
			}
		}	
	}
}

