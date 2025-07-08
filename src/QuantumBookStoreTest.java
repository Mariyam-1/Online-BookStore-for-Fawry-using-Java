public class QuantumBookStoreTest {
    public static void main(String[] args) {
        QuantumBookStore store = new QuantumBookStore();

        // adding books to the store
        Book paperBook1 = new PaperBook("Mirrors", 1972, 450.0, "I", "Naguib Mahfooz", 10);
        Book ebook1 = new EBook("Youtopia", 2011, 320.0, "II", "Ahmed Khaled Tawfik", "PDF");
        Book demoBook = new Demo("Fawry Demo", 2025, 0.0, "III", "Fawry Company");
        Book paperBook2 = new PaperBook("The Secret", 2004, 900.0, "IV", "Rhonda Byrne", 5);
        Book ebook2 = new EBook("Atomic Habits", 2018, 1200.0, "V", "James Clear", "Word");
       System.out.println("\n****** Quantum Book Store ****** \n");

        store.addBook(paperBook1);
        store.addBook(paperBook2);
        store.addBook(ebook1);
        store.addBook(ebook2);
        store.addBook(demoBook);

        // === Valid Purchases ===
         System.out.println("\n***** Quantum Book Store: TEST PURCHASES ***** \n");
        try {
            store.buyBook("I", "mariyam@gmail.com", "Cairo Street", 2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            store.buyBook("II", "mariyam@gmail.com", null, 1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            store.buyBook("V", "mariyam@gmail.com", null, 1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        

        try {
             System.out.println("\n ----trying to buy Demo Book (ISBN: III)----");
            store.buyBook("III", "mariyam@gmail.com", "", 1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        
        try {
            System.out.println("\n ----trying to buy incorrect ISBN ----");
            store.buyBook("XYZ", "mariyam@example.com", "Nowhere", 1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("\n ---trying to buy more than stock available ===");
            store.buyBook("IV", "mariyam@example.com", "Giza", 10);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // remove outdated books 
         System.out.println("\n****** Quantum Book Store: REMOVE OUTDATED *****\n");

        System.out.println("\nQuantum book store: Removing outdated books...");
        store.removeOutdatedBooks(50);

        try {
            System.out.println("\n ---trying to remove already removed book ===");
            store.buyBook("I", "mariyam@example.com", "Old Street", 1);
        } catch (Exception e) {
            System.out.println(e.getMessage() +"\n"); 
        }
    }
       
}
