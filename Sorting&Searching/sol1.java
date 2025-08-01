import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class sol1 {
    public static void Library(HashMap<String, LinkedList<String>> map) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Choose an operation:");
            System.out.println("1. Add books");
            System.out.println("2. Delete a book");
            int operation = sc.nextInt();
            switch (operation) {
                case 1: {
                    System.out.println("Enter the genre");
                    String genre = sc.next();
                    System.out.println("Enter the number of books ");
                    int n = sc.nextInt();
                    LinkedList<String> ll = map.getOrDefault(genre, new LinkedList<>());

                    while (n-- > 0) {
                        System.out.println("Enter the name of the book:");
                        String bookName = sc.next();
                        ll.add(bookName);
                    }

                    map.put(genre, ll);
                    System.out.println("Books added to genre: " + genre);
                    break;
                }

                case 2: {
                    System.out.println("Enter the genre");
                    String gen = sc.next();

                    if (map.containsKey(gen)) {
                        System.out.println("Enter the book to delete");
                        String book = sc.next();
                        LinkedList<String> books = map.get(gen);

                        if (books.remove(book)) {
                            System.out.println("deleted  book from genre " + gen);
                        } else {
                            System.out.println("Boook not found in the genre");
                        }
                    } else {
                        System.out.println("Genroe not found");
                    }
                    break;
                }

                case 3: {
                    exit = true;
                    System.out.println("Exiting the library program.");
                    break;
                }

            }
            System.out.println("Want to exit? 1 for continue 0 for exit");
            int input = sc.nextInt();
            if(input == 0){
                exit=true;
            }
            else{
                exit=false;
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, LinkedList<String>> map = new HashMap<>();
        Library(map);
    }
}