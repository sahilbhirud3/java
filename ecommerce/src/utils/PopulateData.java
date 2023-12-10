package utils;

import java.time.LocalDate;
import java.util.HashMap;

import core.Cloth;
import core.Size;

public class PopulateData {

	public static HashMap<Integer,Cloth> populateClothData()
	{
		HashMap<Integer,Cloth> clothMap=new HashMap<>();
		clothMap.put(1, new Cloth(1, LocalDate.parse("2023-10-02"),LocalDate.parse("2023-10-08"), 12, Size.L, 126.23));
		clothMap.put(2, new Cloth(2, LocalDate.parse("2023-09-12"),LocalDate.parse("2023-05-07"), 0, Size.M, 200.00));
		clothMap.put(3, new Cloth(3, LocalDate.parse("2023-05-02"),LocalDate.parse("2023-05-03"), 13, Size.S, 121.02));
		clothMap.put(4, new Cloth(4, LocalDate.parse("2023-01-12"),LocalDate.parse("2023-02-07"), 7, Size.XL, 400.00));
		clothMap.put(5, new Cloth(5, LocalDate.parse("2023-10-21"),LocalDate.parse("2023-10-22"), 15, Size.S, 300.12));
		clothMap.put(6, new Cloth(6, LocalDate.parse("2023-08-12"),LocalDate.parse("2023-09-11"), 23, Size.L, 106.45));
		clothMap.put(7, new Cloth(7, LocalDate.parse("2023-03-17"),LocalDate.parse("2023-03-27"), 6, Size.M, 600.12));
		clothMap.put(8, new Cloth(8, LocalDate.parse("2023-07-08"),LocalDate.parse("2023-07-03"), 2, Size.XL, 800.00));
		clothMap.put(9, new Cloth(9, LocalDate.parse("2023-09-12"),LocalDate.parse("2023-05-07"), 0, Size.XL, 200.00));
		return clothMap;
		
	}
}
