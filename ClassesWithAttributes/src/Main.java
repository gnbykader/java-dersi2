

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1, "laptop", "Asus Laptop", 3000, 2, "Siyah");
		//Product product = new Product();
		//product.setName("Laptop");
		//product.setId(1);
		//product.setDescription("asus Laptop");
	    //product.setPrice(5000);
		//product.setStockAmount(3);
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());
		
		
	}

}
