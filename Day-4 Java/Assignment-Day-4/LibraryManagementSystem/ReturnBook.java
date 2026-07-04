package LibraryManagementSystem;

public class ReturnBook {
	public void returnBook(Library library, int id) {

        for (Book b : library.book) {

            if (b.getBookId() == id && b.isIssued()) {

                b.setIssued(false);

                System.out.println("Book Returned Successfully.");
                return;
            }
        }

        System.out.println("Invalid Book.");
    }

}
