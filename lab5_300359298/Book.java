public class Book{
    private String author;
    private String title;
    private int year;

    public Book(String author,String title,int year){
        this.author = author;
        this.title = title;
        this.year = year;
    }
    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return title; 
    }
    public int getYear(){
        return year;
    }
    public boolean equals(Object other){
        if(other == null || getClass() != other.getClass()){
            return false;
        }
        Book obj = (Book) other;
        if(year!= obj.year){
            return false;
        }
        if(title == null){
            if(obj.title != null){
                return false;
            }

       }else if(!title.equals(obj.title)){
        return false;
       }

       if(author == null){
         if(obj.author != null){
            return false;
         }
       }else if(! author.equals(obj.author)){
        return false;
       }
       return true;
    }

    public String toString(){
        return (author+":"+title+"("+year+")");
    }
}