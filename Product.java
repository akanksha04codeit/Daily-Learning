import java.util.Scanner;

class Product{
	String code, name;
	Float price;
	
	void setCode(String code) {
		this.code = code;
	}
	void setName(String name) {
		this.name = name;
	}
	void setPrice(Float price) {
		this.price = price;
	}
	
	String getCode() {
		return code;
	}
	String getName() {
		return name;
	}
	Float getPrice() {
		return price;
	}
}

class setter{
	public static void main(String args []) {
		Scanner s = new Scanner(System.in);
		Product ob = new Product();
		System.out.println("Enter Product Code: ");
		ob.setCode(s.nextLine());
		System.out.println("Enter Product Name: ");
		ob.setName(s.nextLine());
		System.out.println("Enter Product Price: ");
		ob.setPrice(s.nextFloat());
		
		System.out.println("====Displaying Product Info====");
		System.out.println("Product Code: "+ob.getCode());
		System.out.println("Product Name: "+ob.getName());
		System.out.println("Product Price: "+ob.getPrice());
		s.close();
	}
}