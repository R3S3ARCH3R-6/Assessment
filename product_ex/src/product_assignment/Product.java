package product_assignment;

public class Product {

	private int id;
	private String name;
	private double rating;
	private double cost;
	private int aisle;
	private int row;
	
	public Product(){
		
	}
	
	public Product(int id, String name, double rating, double cost){
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.cost = cost;
		
	}
	
	public Product(int id, String name, double rating, double cost, int aisle, int row){
		this(id, name, rating, cost);
		this.aisle = aisle;
		this.row = row;
	}
	
	@Override
	public String toString(){
		return "Product [id = " + id + ", name = " + name + ", rating = " 
				+ rating + ", cost = $" + cost + ", aisle = " + aisle + ", row = " + row + "]"; 
	}
}
