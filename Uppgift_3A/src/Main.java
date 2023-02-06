import java.util.Arrays;

public class Main {



    /*
   INTRODUCTION
   A code that stores book in a class named book.

   AUTHOR
   Ulrika Eriksson, 2022-05-27

   IMPLEMENTATION
   Three Book objects are implemented in the beginning of the code. The objects are set through a constructor. The
   Author attribute is an Array (string) to be able to set multiple authors. There is no setters only getters, so the user
   are not able to set authors.

   DISCUSSION
   My first problem I ran into was how I would make the authors to an array. I didn't really understand how I would  make
   an array in a class. I tried making an arraylist, to moving it to the main instead. After som trying I managed to make
   an array object in the class. Because the length is set in the main, an array worked out.

   When I was going to print the price, first I tried to just use book1.getprice + book2.getprice... and so on, but that
   just put the numbers together and didn't add them up. So I had to put the value in different variables and then add
   those up in main, to get the total price.

   I tried to print the different books, but I got the location of the objects instead of the objects. I got the location
   of the array and realised in the getter that I returned the whole array, not each author. After some trying I learned
   about the Arrays.toString which helped me actually return what's in the array. But it did it with brackets, so to
   improve this code I would like to make it present the content of the array without the brackets. I would also like to
   make a method that added the price of the book instead of doing it in the main.


     */

    public static void main(String[] args) {


        //Book class objects are created, the values are set through a constructor.
        Book book1 = new Book("Harry potter", 27, 277, new String[]{"JKK ROWLING"});
        Book book2 = new Book("The tale of the book", 67, 355, new String[]{"Oscar C Moore"});
        Book book3 = new Book("Love is the neighbor", 33, 188, new String[]{"Johanna Swoone","Elvis Elvis"});

        //The attributes are printed through getters.
        System.out.println("Book one" + "\n" + "Name: " + book1.getName() + "\n" + "ISBN: " + book1.getISBN() + "\n" + "Price: " + book1.getPrice() + "\n" + "Authors: " + Arrays.toString(book1.getAuthor()));
        System.out.println("Book two" + "\n" + "Name: " + book2.getName() + "\n" + "ISBN: " + book2.getISBN() + "\n" + "Price: " + book2.getPrice() + "\n" +  "Authors: " + Arrays.toString(book2.getAuthor()));
        System.out.println("Book three " + "\n" + "Name: " + book3.getName() + "\n" + "ISBN: " + book3.getISBN() + "\n" + "Price: " + book3.getPrice() + "\n" + "Authors: " + Arrays.toString(book3.getAuthor()));

        //The book prices are fetched and added upp, and then printed.
        int p1 = book1.getPrice();
        int p2 = book2.getPrice();
        int p3 = book3.getPrice();

        int totalPrice = p1 + p2 + p3;

        System.out.println("\n");
        System.out.println("The total price of all books is: " + totalPrice + "KR");
        
    }
}