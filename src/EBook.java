public class EBook extends Book {
    private String fileType;
    public EBook(String title,int published_year,
double price,String ISBN,String author, String fileType)
{
    super( title, published_year,price, ISBN, author);
    this.fileType = fileType;
}
@Override
public  boolean isAvailable(){
    return true;
}

@Override
public  void deliver(String address,String email){
    System.out.println("We are sending the Book with the file type: " +fileType +" to your email: "+ email);
}

@Override
public void buyBook(int quantity) throws Exception
{
   
}

    
}
