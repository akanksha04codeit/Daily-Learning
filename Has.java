public class Has {
	public static void main(String[] args) {
		Author auth = new Author("Marchand","22334","MP");
		Book bk = new Book("Nishant", "Udan", "120");
	}
}
class Author{
	String authName;
	String authContact;
	String authAddress;
	
   public Author(String n, String num, String add ) {
		this.authName = n;
		this.authContact = num;
		this.authAddress = add;
	}
}

class Book{
	String author;  //to get reference from the another class
	String bName;
	String bprice;
	
	public Book(String author, String bn, String pr) {
		this.author = author;
		this.bName = bn;
		this.bprice = pr;
	}
}
