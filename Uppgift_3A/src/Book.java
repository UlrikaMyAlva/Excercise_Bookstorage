public class Book {

    private String name;
    private int ISBN;

    private int price;
    private String [] author;

    //A constructor that sets the attributes.
    Book (String name, int ISBN, int price, String [] author) {
        this.name = name;
        this.ISBN = ISBN;
        this.price = price;
        this.author = author;
    }

    //Getters
    public String getName () {
        return name;
    }

    public int getISBN() {
        return ISBN;
    }

    public String [] getAuthor () {
        return author;
    }


    public int getPrice() {
        return price;
    }

}
