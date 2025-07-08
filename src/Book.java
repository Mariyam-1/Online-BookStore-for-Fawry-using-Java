public abstract class Book {
    protected String title;
    protected int published_year;
    protected double price;
    protected String ISBN;
    protected String author;
public Book()
{
    this.title = "";
    this.published_year = 0;
    this.price = 0.0;
    this.ISBN = "";
    this.author = "";
}
public Book(String title,int published_year,
double price,String ISBN,String author)
{
    this.title = title;
    this.published_year= published_year;
    this.price=price;
    this.ISBN= ISBN;
    this.author= author;
}
public abstract boolean isAvailable();
public abstract void deliver(String address,String email);
public abstract void buyBook(int quantity) throws Exception;
public String getISBN()
{
    return ISBN;
}
public int getPuplishedYear()
{
    return published_year;
}  
public double getPrice()
{
    return price;
}
public String getAuthor()
{
    return author;
}
public String getTitle()
{
    return title;
}
}
