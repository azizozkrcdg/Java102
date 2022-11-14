public class Book implements Comparable<Book>{
    private String bookName;
    private int pageOfNumber;
    private String writerName;
    private int releaseDate;

    public Book(String bookName, int pageOfNumber, String writerName, int releaseDate){
        this.bookName = bookName;
        this.pageOfNumber = pageOfNumber;
        this.writerName = writerName;
        this.releaseDate = releaseDate;
    }

    public String getBookName(){
        return bookName;
    }

    public void setBookName(String bookName){
        this.bookName = bookName;
    }

    public int getPageOfNumber(){
        return pageOfNumber;
    }

    public void setPageOfNumber(int pageOfNumber){
        this.pageOfNumber = pageOfNumber;
    }

    public String getWriterName(){
        return writerName;
    }

    public void setWriterName(String writerName){
        this.writerName = writerName;
    }

    public int getReleaseDate(){
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate){
        this.releaseDate = releaseDate;
    }

    @Override
    public int compareTo(Book b){
        return getBookName().compareTo(b.getBookName());
    }
}
