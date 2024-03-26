
public class Book implements Comparable<Book> {
    int ID, publishDate, pageNumber;
    String bookName, authorName;

    //Constructor method of the Book object
    public Book(int ID, String bookName, String authorName, int pageNumber, int publishDate) {
        this.ID = ID;
        this.bookName = bookName;
        this.authorName=authorName;
        this.pageNumber=pageNumber;
        this.publishDate=publishDate;

    }
    // Implementation of the CompareTo method from the Comparable interface to compare books based on the characters of book names.
    @Override
    public int compareTo(Book book) {
        return this.getBookName().compareTo(book.getBookName());
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
