public class PaperBook extends Book {
    private int bookStock;
    public PaperBook(String title,int published_year, double price,String ISBN,String author, int bookStock)
{
    super( title, published_year,price, ISBN, author);
    this.bookStock=bookStock;
}
@Override
public  boolean isAvailable(){
    return (bookStock>0);
}

@Override
public  void deliver(String address,String email){
    System.out.println("We are delivering the book with ISBN: " + ISBN + " to this address" + address);
}

@Override
public void buyBook(int quantity) throws Exception
{
    if(bookStock< quantity)
    throw new Exception("Error: There is no enough stock for the book with ISBN"+ ISBN);
    bookStock -= quantity;
}

    
}
