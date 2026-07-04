package LibraryManagementSystem;

public class SearchBook {
	public void searchBook(Library library, String name) {

        for (Book b : library.book) {

            if (b.getBookName().equalsIgnoreCase(name)) {

                System.out.println("Book Found");
                System.out.println("Book ID : " + b.getBookId());
                System.out.println("Book Name : " + b.getBookName());

                return;
            }
        }

        System.out.println("Book Not Found.");
    }

}
