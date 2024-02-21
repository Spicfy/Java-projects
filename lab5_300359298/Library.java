import java.util.ArrayList;
public class Library {
    private ArrayList<Book> Library= new ArrayList<Book>();

    public Book getBook(int index){
        return Library.get(index);
    }

    public int getSize(){
        return Library.size();
    }

    public void addBook(Book book){
        if(book != null){
            Library.add(book);
        }
    }

    public void sort(){
        BookComparator s =  new BookComparator();
        Library.sort(s);

        }
        
    public void printLibrary(){
        for(int i = 0; i< getSize(); i++){
            System.out.println(Library.get(i));
        }
    }
}
