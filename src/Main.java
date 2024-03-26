
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


        TreeSet<Book> set = new TreeSet<>();// first set:

        set.add(new Book(1, "Fareler ve İnsanlar", "John Steinbeck", 111, 1937));
        set.add(new Book(2, "Kırmızı Pazartesi", "Gabriel Garcia Marquez", 112, 1981));
        set.add(new Book(3, "Morgue Sokağı Cinayetleri", "Edgar Allan Poe", 149, 1841));
        set.add(new Book(4, "Dinle Küçük Adam", "Wilhelm Reich", 128, 1945));
        set.add(new Book(5, "Insan Neyle Yaşar", "Lev Nikolayeviç Tolstoy", 56, 1885));

        System.out.println("Alfabetik Olarak Sırala : \n");
        for (Book book : set) {
            System.out.println(book.getID() + " - " + book.getBookName() + " - " +
                    book.getAuthorName() + " - " + book.getPageNumber() + " - " + book.getPublishDate());
        }

        System.out.println("=============================================");
        System.out.println("Sayfa Numarasına Göre Sırala : \n");



        TreeSet<Book> set2 = new TreeSet<>(new Comparator<Book> () { //Second set
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber() - o2.getPageNumber();
            }
        });

        set2.add(new Book(1, "Fareler ve İnsanlar", "John Steinbeck", 111, 1937));
        set2.add(new Book(2, "Kırmızı Pazartesi", "Gabriel Garcia Marquez", 112, 1981));
        set2.add(new Book(3, "Morgue Sokağı Cinayetleri", "Edgar Allan Poe", 149, 1841));
        set2.add(new Book(4, "Dinle Küçük Adam", "Wilhelm Reich", 128, 1945));
        set2.add(new Book(5, "Insan Neyle Yaşar", "Lev Nikolayeviç Tolstoy", 56, 1885));


        for (Book book : set2) {
            System.out.println(book.getID() + " - " + book.getBookName() + " - " +
                    book.getAuthorName() + " - " + book.getPageNumber() + " - " + book.getPublishDate());
        }
    }
}