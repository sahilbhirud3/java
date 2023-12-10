package core;

import java.time.LocalDate;

public class Cloth {

	private Integer id;
	private LocalDate listing_Date;
	private LocalDate stockUpdateDate;
	private int stock;
	private Size size;
	private double price;
	
	
	public Cloth(int id, LocalDate listing_Date, LocalDate stockUpdateDate, int stock, Size size, double price) {
		super();
		this.id = id;
		this.listing_Date = listing_Date;
		this.stockUpdateDate = stockUpdateDate;
		this.stock = stock;
		this.size = size;
		this.price = price;
	}
	
	public Integer getId() {
		return id;
	}
	public LocalDate getListing_Date() {
		return listing_Date;
	}
	public LocalDate getStockUpdateDate() {
		return stockUpdateDate;
	}
	public int getStock() {
		return stock;
	}
	public Size getSize() {
		return size;
	}
	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Cloth [id=" + id + ", listing_Date=" + listing_Date + ", stockUpdateDate=" + stockUpdateDate
				+ ", stock=" + stock + ", size=" + size + ", price=" + price + "]";
	}


	

	
	
	
	
}
