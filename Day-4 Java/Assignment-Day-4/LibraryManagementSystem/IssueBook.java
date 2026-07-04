package LibraryManagementSystem;

public class IssueBook {
	public void issueBook(Library library, int id) {

        for (Book b : library.book) {

            if (b.getBookId() == id && !b.isIssued()) {

                b.setIssued(true);

                System.out.println("Book Issued Successfully.");
                return;
            }
        }

        System.out.println("Book Not Available.");
    }

}
