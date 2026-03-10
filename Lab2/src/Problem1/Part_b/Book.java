package Problem1.Part_b;

public class Book extends LibraryItem{
    private int numberOfPages;

    public Book(int numberOfPages, String title, String author, int publicationYear){
        super(title,author,publicationYear);
        this.numberOfPages=numberOfPages;
    }

}
