package LibraryManagementSystem;

public class Book {
	private int bookId;
    private String bookName;
    private boolean issued;

    public Book(int bookId, String bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.issued = false;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

   

    public boolean isIssued() {
        return issued;
    }

    public void setIssued(boolean issued) {
        this.issued = issued;
    }

}
