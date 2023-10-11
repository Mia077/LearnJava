package teckwil.com.bookcolectiontask;

import java.util.HashMap;
import java.util.Map;

public class ExecutionService {
    public static void main(String[] args) {
         Book mihaisbook = new Book("Atomic Habits", "James C.");
         Book alexbook = new Book("Crime and Punishment", "Feodor D.");
         Book ruxandasbook = new Book("To kill a Mockingbird", "Harper L.");
         Book veronicasBook = new Book("Karamazov Brothers", "Feodor D.");
        Book mihais2book = new Book("1984", "George O.");

        System.out.println(mihais2book.getTitle());
        alexbook.printTheBookDetails();


        Library carturestiLibrary = new Library("Carturesti");
        carturestiLibrary.addBook(mihaisbook);
        carturestiLibrary.addBook(mihaisbook);
        carturestiLibrary.addBook(ruxandasbook);
        carturestiLibrary.addBook(veronicasBook);

        System.out.println(carturestiLibrary.getTheStock());
        System.out.println(carturestiLibrary.isThereThisBook(alexbook));

        carturestiLibrary.addBook(alexbook);
        System.out.println(carturestiLibrary.isThereThisBook(alexbook));

        carturestiLibrary.deleteABookIfExists(alexbook);
        System.out.println(carturestiLibrary.isThereThisBook(alexbook));

        carturestiLibrary.printAllTheBooks();

        Library victorsLibrary = new Library("Cartier");
        victorsLibrary.addBook(alexbook);
        victorsLibrary.addBook(veronicasBook);
        System.out.println(victorsLibrary.getTheStock());
        victorsLibrary.printAllTheBooks();

        Map<String, Library> libraryMap= new HashMap<>();
        libraryMap.put("Str.Stefan 165", carturestiLibrary);
        libraryMap.put("str. Trandafirilor 15", victorsLibrary);

        libraryMap.get("Str.Stefan 165").printAllTheBooks();
        System.out.println(libraryMap.get("str. Trandafirilor 15").isThereThisBook(veronicasBook));


        int[] dataTable = new int[7];
        dataTable = new int[]{65, 4, 3, 23, 45, 7, 6};
        System.out.println(IntNumberArrayService.findMin(dataTable));
        System.out.println(IntNumberArrayService.getAvg(dataTable));
    }

}
