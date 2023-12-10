package utils;

import java.time.LocalDate;
import java.util.HashMap;

import core.Cloth;
import core.Size;

public class ClothValidation {

	public static void validateInputs(int id,String listing_Date,int stock,String size, double price,HashMap<Integer, Cloth> clothMap)
	{
		LocalDate validListingDate=parseNValidate(listing_Date);
		Size validSize =validateSize(size);
		//public Cloth(int id, LocalDate listing_Date, LocalDate stockUpdateDate, int stock, Size size, double price) {
		clothMap.put(id,new Cloth(id,validListingDate,LocalDate.now(),stock,validSize,price ));
		
	}
	
	public static Size validateSize(String size)
	{
		return Size.valueOf(size.toUpperCase()); 
	}
	
	public static LocalDate parseNValidate(String inputDate)
	{
		return LocalDate.parse(inputDate);
	}

}
