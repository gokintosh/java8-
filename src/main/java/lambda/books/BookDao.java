package lambda.books;

import java.util.ArrayList;
import java.util.List;

public class BookDao {

    public List<Book> getBooks(){
        List<Book>bookList=new ArrayList<>();

        bookList.add(new Book(1,"gokul",121));
        bookList.add(new Book(2,"Malappuram",134));
        bookList.add(new Book(4,"yellamali",345));
        bookList.add(new Book(6,"sitramayan",543));

        return bookList;
    }
}
