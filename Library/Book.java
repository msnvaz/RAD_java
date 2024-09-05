public class Book {
    
    String BookId;
    String Title;
    String Author;
    boolean isAvailable;
    int borrowedDate;
    
    public Book(String BookIdIn, String TitleIn, String AuthorIn){
        this.BookId = BookIdIn;
        this.Title = TitleIn;
        this.Author = AuthorIn;
        this.isAvailable = true;
    }

    public void display(){
        System.out.println("Book ID: " + this.BookId);
        System.out.println("Title: " + this.Title);
        System.out.println("Author: " + this.Author);
        System.out.println("Available: " + this.isAvailable);
    }

    
    public void setAvailable() {
        isAvailable=true;
    }

    public void setUnavailable() {
        isAvailable = false;
    }

    public boolean getAvailable(){
        return this.isAvailable;
    }
}
