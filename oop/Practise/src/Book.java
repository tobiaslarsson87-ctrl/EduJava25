public class Book {
    String title;
    String author;
    int pages;
    String genre;
    //KONSTRUKTOR
    Book(String title, String author, int pages, String genre) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.genre = genre;
    }
    //METODER
    public void info()
    {
        System.out.println("--------------------------------------------------");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("--------------------------------------------------");
    }
    public void slowReader()
    {
        int timeInvestment = pages / 15;
        System.out.println("You would read this book in about: " + timeInvestment + " days.");
    }
    public void fastReader()
    {
        int timeInvestment = pages / 30;
        System.out.println("You would read this book in about: " + timeInvestment + " days.");
    }
    public void bookWorm()
    {
        int timeInvestment = pages / 120;
        System.out.println("You would read this book in about: " + timeInvestment + " days.");
    }
    public void checkGenre(String comparison)
    {
        if (comparison.equals(genre))
        {
            System.out.println("The genre of both books is " + genre);
        }
        else
        {
            System.out.println("The genre of this book is " + genre + " not " +  comparison + ".");
        }
    }
}

