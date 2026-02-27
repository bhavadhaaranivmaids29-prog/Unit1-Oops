import java.util.*;
public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of books to add: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        Book[] books = new Book[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Book " + (i + 1) + ":");
            System.out.print("Enter Book ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Book Title: ");
            String title = sc.nextLine();
            System.out.print("Enter Author Name: ");
            String author = sc.nextLine();
            System.out.print("Enter Publisher Name: ");
            String publisher = sc.nextLine();
            System.out.print("Enter Edition: ");
            String edition = sc.nextLine();
            System.out.print("Enter Year of Publication: ");
            int year = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            sc.nextLine();
            System.out.print("Enter Number of Copies: ");
            int copies = sc.nextInt();
            sc.nextLine();
            books[i] = new Book(id, title, author, publisher, edition, year, price, copies);
        }
    }
}
class Book {
    int id;
    String title;
    String author;
    String publisher;
    String edition;
    int year;
    double price;
    int copies;
    Book(int id, String title, String author, String publisher, String edition,
         int year, double price, int copies) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.edition = edition;
        this.year = year;
        this.price = price;
        this.copies = copies;
    }

    void display() {
        System.out.println("\nBook ID: " + this.id);
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Publisher: " + this.publisher);
        System.out.println("Edition: " + this.edition);
        System.out.println("Year of Publication: " + this.year);
        System.out.println("Price: $" + this.price);
        System.out.println("Number of Copies: " + this.copies);

    }
