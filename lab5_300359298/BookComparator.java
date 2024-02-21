import java.util.Comparator;
public class BookComparator implements Comparator<Book>{
    public int compare(Book x, Book y){
        if(x.getAuthor().compareTo(y.getAuthor()) == 0){
            if(x.getTitle().compareTo(y.getTitle()) == 0){
                if(x.getYear() == y.getYear()){
                    return 0;
                }
                else if(x.getYear()> y.getYear()){
                    return 1;
                }
                else{
                    return -1;
                }
            }
            else if(x.getTitle().compareTo(y.getTitle()) > 0){
                return 1;
            }
            else{
                return -1;
            }
        }
        else if(x.getAuthor().compareTo(y.getAuthor())> 0){
            return 1;
        }
        else{
            return -1;
        }
    }

    
}