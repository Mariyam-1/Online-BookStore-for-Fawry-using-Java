public class Demo extends Book {

    public Demo(String title,int published_year, double price,String ISBN,String author)
{
    super( title, published_year,0.0, ISBN, author);
    
}
@Override
public  boolean isAvailable(){
    return false;
}

@Override
public  void deliver(String address,String email){
    System.out.println("This book cannot be deliverd. " );
}

@Override
public void buyBook(int quantity) throws Exception
{
   System.out.println("Demo books are not for sale: "+ ISBN);
}

    
}
