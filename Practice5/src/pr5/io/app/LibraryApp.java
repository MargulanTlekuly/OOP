package pr5.io.app;

import pr5.io.model.Book;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args){
        String fileName = "library.dat";
        ArrayList<Book> books = new ArrayList<>();

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))){
            books = (ArrayList<Book>) ois.readObject();
            System.out.println("Library loaded successfully!");
        }catch (FileNotFoundException e){
            System.out.println("The library file does not exist yet. A new one will be created.");
        }catch (IOException | ClassNotFoundException e){
            System.out.println("Error loading data: " + e.getMessage());
        }

        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;

        while(isRunning){
            System.out.print("\nChoose an action - (A)dd a book, (L)ist books, (Q)uit: ");
            String choice = sc.nextLine().toUpperCase();

            switch (choice){
                case "A":
                    System.out.println("Enter the book title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter the author: ");
                    String author =  sc.nextLine();

                    books.add(new Book(title, author));
                    System.out.println("The book has been added!");
                    break;

                case "L":
                    if(books.isEmpty()){
                        System.out.println("The library is empty.");
                    }else{
                        System.out.println("List of books:");
                        for(Book book:books){
                            book.visit();
                            System.out.println(book);
                        }
                    }
                    break;
                case "Q":
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid command. Try again.");
            }
        }

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
            oos.writeObject(books);
            System.out.println("The library has been saved to file " + fileName + ". Goodbye!");
        }catch (IOException e){
            System.out.println("Error saving: " + e.getMessage());
        }
    }
}
