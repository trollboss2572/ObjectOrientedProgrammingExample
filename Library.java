import java.util.HashSet;

public class Library extends Collection
{
	public Library() {
		super(HashSet<Book>);
	}
	String determineBoxSize(Book book) {
		double length = book.getLength();
		double width = book.getWidth();
		double height = book.getHeight();
		double max = length;
		if(max < width)
			max = width;
		if(max < height)
			max = height;
		if(max < 5)
			return "small";
		else if(max < 15)
			return "medium";
		else
			return "large";
	}
	
	void deliver(Book book, Customer customer) {
		if(bookExists(book)){
			System.out.println("Delivering " + book);
			System.out.println("Delivery service: Books Express");
			System.out.println("Box size: " + determineBoxSize(book));
			System.out.println("Address: " + customer.getPostalCode());
			removeBook(book);
		}
	}

}
