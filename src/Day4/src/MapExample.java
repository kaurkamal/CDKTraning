import java.util.HashMap;
import java.util.Map;

/**
 * Created by kaurk on 7/18/2017.
 */
class Book {
    int id;
    String publisherName , bookName;
    public Book(int id, String publisherName, String bookName) {
        this.id = id;
        this.publisherName = publisherName;
        this.bookName = bookName;
    }
}
public class MapExample {
    public static void main(String[] args){
    Map<Integer, Book> map = new HashMap<>();
    Book b1 = new Book(1,"abc","book1");
    Book b2 = new Book(2,"xyz","book2");
    map.put(1,b1);
    map.put(2,b2);
        for(Map.Entry<Integer, Book> m : map.entrySet()){
            int key = m.getKey();
            Book b = m.getValue();
            System.out.println(key);
            System.out.println(b.id+" " + b.publisherName + " " + b.bookName);

        }}
        }
