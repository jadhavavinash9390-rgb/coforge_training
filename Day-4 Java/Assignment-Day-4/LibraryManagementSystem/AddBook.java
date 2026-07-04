package LibraryManagementSystem;

public class AddBook {
	public void addBook(Library library, Book book) {

        library.book.add(book);

        System.out.println(book.getBookName() + " Added Successfully.");
    }

}
