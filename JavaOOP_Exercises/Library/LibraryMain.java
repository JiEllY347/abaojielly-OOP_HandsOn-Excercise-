package Library;

public class LibraryMain {
     public static void main(String[] args) {
       
        Library book1 = new Library("To Kill a Mockingbird", "Harper Lee", "9780743273565");
        Library book2 = new Library("1984", "George Orwell", "9780060935467");
        Library book3 = new Library("Pride and Prejudice", "Jane Austen", "9780451524935");

      
        Library.addBook(book1);
        Library.addBook(book2);
        Library.addBook(book3);

        Library.displayAllBooks();


        Library.removeBook("9780060935467");

    
        Library.displayAllBooks();
    }
}
