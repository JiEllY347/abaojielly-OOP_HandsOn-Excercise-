package Book;

public class BookMain {
    public static void main(String[] args) {
       
        Book book1 = new Book(" Hell University ", " Knight ", " 187649377 ");
        Book book2 = new Book(" Life must go on", " Jen Fer ", " 7873942 ");
        Book book3 = new Book(" Healing ", "Thomas Narger ", " 9717293 ");

      
        Book.addBook(book1);
        Book.addBook(book2);
        Book.addBook(book3);

        Book.displayAllBooks();


        Book.removeBook(" 7873942 ");

    
        Book.displayAllBooks();
    }
} 
    

