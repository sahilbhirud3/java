package utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;

import core.Cloth;
import core.Size;

public class Utility {

	public static void displaySmallSizeCloths(HashMap<Integer, Cloth> clothMap) {

		clothMap.values().stream().filter(cloth -> cloth.getSize() == Size.S)
				.forEach(cloth -> System.out.println(cloth));
	}

	public static void displayOutOfStockCloths(HashMap<Integer, Cloth> clothMap) {
		clothMap.values().stream().filter(cloth -> cloth.getStock() == 0).forEach(cloth -> System.out.println(cloth));

	}

	public static void removeOutOfStock(HashMap<Integer, Cloth> clothMap, int month) {

		
		  clothMap.values().stream() .filter(cloth-> cloth.getStock()==0 &&
		  Period.between(cloth.getStockUpdateDate(),LocalDate.now()).toTotalMonths()>
		  month) .forEach(cloth->System.out.println(cloth));
		 
		// clothMap.values().removeIf(cloth-> cloth.getStock()==0 &&
		// Period.between(cloth.getStockUpdateDate(),LocalDate.now()).toTotalMonths()>month);

		// clothMap.values().stream().filter(c -> c.getStock()==0 &&
		// Period.between(c.getStockUpdateDate(),
		// LocalDate.now()).toTotalMonths()>month).forEach(cloth ->
		// System.out.println(cloth));

		clothMap.entrySet().removeIf(entry -> entry.getValue().getStock() == 0 && Period.between(entry.getValue().getStockUpdateDate(), LocalDate.now()).toTotalMonths() > month);

		clothMap.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));
		  
		/*
		 * clothMap.forEach((k,cloth)->{ if(cloth.getStock()==0 &&
		 * Period.between(cloth.getStockUpdateDate(),LocalDate.now()).toTotalMonths()>
		 * month){ clothMap.remove(k); } });
		 */
		  
		  
		  


	}
}
