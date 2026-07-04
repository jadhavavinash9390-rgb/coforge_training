package LibraryManagementSystem;

public class LibraryApp {
	public static void main(String[] args) {

        Library library = new Library();

        AddBook add = new AddBook();
        IssueBook issue = new IssueBook();
        ReturnBook ret = new ReturnBook();
        SearchBook search = new SearchBook();

        add.addBook(library, new Book(101, "Java Programming"));
        add.addBook(library, new Book(102, "Python Basics"));
        add.addBook(library, new Book(103, "Data Structures"));

        System.out.println();

        search.searchBook(library, "Python Basics");

        System.out.println();

        issue.issueBook(library, 102);

        System.out.println();

        ret.returnBook(library, 102);
    }

}
