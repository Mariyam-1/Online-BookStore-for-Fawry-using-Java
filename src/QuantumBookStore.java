import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class QuantumBookStore {
    
    private List<Book> ourBooks = new ArrayList<>();
    public void addBook(Book book)
    {
        ourBooks.add(book);
        System.out.println("Book with ISBN: "+book.getISBN() +" added successfully.");
    }
   
    private Book findBookByISBN(String ISBN)
     {
        for (Book book : ourBooks) 
        {
            if (book.getISBN().equals(ISBN)) 
                return book;
            
        }
        return null;
    }
    public void removeOutdatedBooks(int maxYears)
    {
        List<Book> OutDated = new ArrayList<>();
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        for( Book book: ourBooks)
        {
            if(currentYear- book.getPuplishedYear() > maxYears)
            OutDated.add(book) ;
        }
        for( Book book : OutDated)
        {
            ourBooks.remove(book);
            System.out.println("Removed OutDated book with ISBN : "+ book.getISBN());
        }
    }
    public double buyBook( String ISBN,String email, String address, int quantity) throws Exception
    {
        Book myBook= findBookByISBN(ISBN);
        if (myBook==null)
        throw new Exception("Book with ISBN:" +ISBN+" not found!");
        if(!myBook.isAvailable())
        throw new Exception("This Book is not available");
        myBook.buyBook(quantity);
        double total = myBook.getPrice()* quantity;
        myBook.deliver(address, email);
        System.out.println("Your Purchase is successfull with total amount paid: EGP " + total);
        return total;


    }

}
