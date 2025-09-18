//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Addera Objekt
        Book myBook1 = new Book("Lord of the rings", "J.R.R Tolkien", 500, "Fantasy");
        Book myBook2 = new Book("Harry Potter", "JK rowling", 800, "Fantasy");

        //Logga info
        myBook1.info();
        myBook1.slowReader();
        myBook2.info();
        myBook2.fastReader();

        myBook1.checkGenre("Horror");

        comparePages(myBook1, myBook2);
    }

    public static void comparePages(Book book1, Book book2)
    {
        if (book1.pages > book2.pages) {
            System.out.println(book1.title + " is longer than " + book2.title +".");
        }
        else {
            System.out.println(book2.title + " is longer than " + book1.title +".");
    }
    }
}