package app;

import java.util.HashMap;
import java.util.Scanner;

import core.Cloth;
import customException.EcomException;
import utils.ClothValidation;
import static utils.PopulateData.populateClothData;
import utils.Utility;

public class EcomApp {

	public static void main(String[] args) {
	
		
		boolean done=false;
		HashMap<Integer,Cloth> clothMap=populateClothData();
		
		try(Scanner sc= new Scanner(System.in))
		{
			
			while(!done)
			{
				System.out.println("************Menu******************");
				System.out.println("1.Add New Cloth");
				System.out.println("2.Display Cloth having size S");
				System.out.println("3.Display Out of Stock Clothes");
				System.out.println("4.Remove Clothes which are out of stock for three month");
				System.out.println("5.Diplay All");
				System.out.println("Enter Your choice");

				try {
					switch(sc.nextInt())
					{
					case 1://add
						System.out.println("Enter data:");
						System.out.println("Enter id");
						int id=sc.nextInt();
						if(clothMap.containsKey(id))
							throw new EcomException("Id is aleready present try Again");
						System.out.println("listing_Date,  stock,  size,  price");
						//validateInputs(int id,String listing_Date,int stock,String size, double price,HashMap<Integer, Cloth> clothMap)
						ClothValidation.validateInputs(id, sc.next() ,sc.nextInt(), sc.next(), sc.nextDouble(),clothMap);
						System.out.println("Data Added Succesfully");
						
						break;
//					case 2://update	
//						
//						break;
					case 2://Display Cloth having size S
						System.out.println("Cloth Having size S");
						Utility.displaySmallSizeCloths(clothMap);
						break;
					case 3://Display Out of Stock Clothes
						System.out.println("Out Of Stock Cloths");
						Utility.displayOutOfStockCloths(clothMap);
						break;
					case 4://Remove Clothes which are out of stock for three month
						Utility.removeOutOfStock(clothMap,3);
						System.out.println("Removed Successfully");
						break;
					case 5://display all
						clothMap.values()
						.forEach(cloth->System.out.println(cloth));
						break;
						
					case 0:
						done=true;
						System.out.println("Good Bye");
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}

			
		}

		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	
}
