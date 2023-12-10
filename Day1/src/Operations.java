import java.util.Scanner;
class Operations
{

	public static void main(String[] args)
	{
		boolean done=false;
		int choice;
		float num1=0,num2=0;
		Scanner sc=new Scanner(System.in);
		while(!done)
		{
			System.out.println("1.Add   \n 2.Substract  \n 3.Multiple   \n 4.Divide \n 5.Exit");
			System.out.println("Enter the choice");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1: 
					System.out.println("Enter the 2 Numbers:");
					num1=sc.nextInt();
					num2=sc.nextInt();
					System.out.println("Addition : "+num1+" + "+num2+":"+(num1+num2));
				break;
				
				case 2: 
					System.out.println("Enter the 2 Numbers:");
					num1=sc.nextInt();
					num2=sc.nextInt();
					System.out.println("Substraction : "+num1+" - "+num2+":"+(num1-num2));
				break;
						
				case 3: 
					System.out.println("Enter the 2 Numbers:");
					num1=sc.nextInt();
					num2=sc.nextInt();
					System.out.println("Multiplication : "+num1+" * "+num2+":"+(num1*num2));
				break;
				
				case 4: 
					System.out.println("Enter the 2 Numbers:");
					num1=sc.nextInt();
					num2=sc.nextInt();
					System.out.println("Divide : "+num1+" / "+num2+":"+(num1/num2));
				break;
				
				case 5: done=true;
				break;
				
				default:
					System.out.println("Invalid Choice enter valid choice");
				break;					
			}
		}
		System.out.println("Exit Successfully");
			
	}
}

