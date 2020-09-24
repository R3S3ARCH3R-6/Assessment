package product_assignment;

public class ProductMain {

	public static void main(String[] args) {
		Product p1 = new Product(401033, "XBOX Series X", 4.1, 499.99);
		System.out.println(p1 + "\n");
		
		Product p2 = new Product(30012, "PlayStation 5", 4.3, 599.99);
		System.out.println(p2 +"\n");
		
		Product p3 = new Product(12653, "Nikon X3 Camera", 3.9, 99.99, 13, 4);
		System.out.println(p3 + "\n");
		
		Product p4 = new Product(13492, "Kodak 34 Camera", 3.2, 39.99, 11, 6);
		System.out.println(p4);
	}

}
