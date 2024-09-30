//Manage a Library System Using Classes, Map, and Set
//Problem Statement:
//You need to create a simple library system where books are managed using classes. Each book has a title, author, and ISBN number. The library should keep track of books and which users have borrowed them.
//Create a class Book that contains:
//title (String)
//author (String)
//isbn (String)
//Create a class User that contains:
//name (String)
//borrowedBooks (Set<Book>)
//Create a class Library that contains:
//A Map<User, Set<Book>> to track which users have borrowed which books.
//Features to Implement:
//-Add a Book: Allow the library to add a book to a user's borrowed list.
//-Remove a Book: Allow the library to remove a book from a user's borrowed list.
//-List User's Borrowed Books: Given a user, list all the books they have borrowed.

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class LibrarySystem {

    // Book Class
    public static class Book {
        private String title;
        private String author;
        private String isbn;

        public Book(String title, String author, String isbn) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public String getIsbn() {
            return isbn;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Book book = (Book) o;
            return Objects.equals(isbn, book.isbn);
        }

        @Override
        public int hashCode() {
            return Objects.hash(isbn);
        }

        @Override
        public String toString() {
            return title + " by " + author;
        }
    }

    // User Class
    public static class User {
        private String name;
        private Set<Book> borrowedBooks;

        public User(String name) {
            this.name = name;
            this.borrowedBooks = new HashSet<>();
        }

        public String getName() {
            return name;
        }

        public Set<Book> getBorrowedBooks() {
            return borrowedBooks;
        }

        public void borrowBook(Book book) {
            borrowedBooks.add(book);
        }

        public void returnBook(Book book) {
            borrowedBooks.remove(book);
        }
    }

    // Library Class
    public static class Library {
        private Map<User, Set<Book>> userBooksMap;

        public Library() {
            userBooksMap = new HashMap<>();
        }

        // Add a book to a user's borrowed books
        public void addBook(User user, Book book) {
            userBooksMap.computeIfAbsent(user, k -> new HashSet<>()).add(book);
            user.borrowBook(book);
        }

        // Remove a book from a user's borrowed books
        public void removeBook(User user, Book book) {
            if (userBooksMap.containsKey(user)) {
                userBooksMap.get(user).remove(book);
                user.returnBook(book);
            }
        }

        // List all books borrowed by a user
        public Set<Book> listBorrowedBooks(User user) {
            return userBooksMap.getOrDefault(user, new HashSet<>());
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Library library = new Library();

        // Create books
        Book book1 = new Book("1984", "George Orwell", "123456");
        Book book2 = new Book("Brave New World", "Aldous Huxley", "7891011");

        // Create users
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        // Add books to users
        library.addBook(user1, book1);
        library.addBook(user2, book2);

        // List borrowed books for Alice
        System.out.println("Alice's borrowed books: " + library.listBorrowedBooks(user1));

        // Remove a book from Alice
        library.removeBook(user1, book1);
        System.out.println("Alice's borrowed books after removal: " + library.listBorrowedBooks(user1));
    }
}
