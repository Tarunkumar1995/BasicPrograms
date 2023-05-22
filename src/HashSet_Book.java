import java.util.HashSet;

public class HashSet_Book {
    public static void main(String[] args) {
        HashSet<Book> book = new HashSet<Book>();
       Book b1 = new Book(1,"Sean","Xyz","Ark ppublisher",200);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);

        book.add(b1);
        book.add(b2);
        book.add(b3);

        for(Book b : book){
            System.out.println(b.id + " " + b.name+ " " + b.author + " " + b.publisher+ " " +  b.quantity);
        }
    }
}

class Book{
    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity){
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

}
