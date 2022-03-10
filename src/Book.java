public class Book {
    String bookName;
    String author;
    int numberOfPages;

    public Book(String bookName, String author, int numberOfPages){

        this.bookName = bookName;
        this.author = author;
        this.numberOfPages = numberOfPages;

    }

    public String bookDetail(){
        return "bookName: " + bookName + "\nauthor: " + author + "\nnumberOfPages: " + numberOfPages;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author=author;
    }
    public int getNumberOfPages(){
        return numberOfPages;
    }
    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages=numberOfPages;
    }
}
