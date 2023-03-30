public class Book {
    String name; double price; int qty; Author author;

    public Book(String nName, Author autho, double pri, int q) {
        name =nName; author = autho; price = pri; qty = q;}

    public double getPrice(){return price;}
    public String getName(){return name;}
    public Author getAuthor(){return author;}
    public void setPrice(double pri){price = pri;}
    public int getQty(){return qty;}
    public void setQty(int q){qty = q;}
    public String toString()
    {return "'" + name + "' by " + author.name + " (" + author.gender + ") at " + author.email; }
}
