import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> book = new TreeSet<>();
        book.add(new Book("Hasretinden Prangalar Eskittim", 120,
                "Ahmed Arif", 1968));
        book.add(new Book("Şeker Portakalı", 183,
                "José Mauro de Vasconcelos", 1968));
        book.add(new Book("Kürk Mantolu Madonna", 177,
                "Sabahattin Ali", 1943));
        book.add(new Book("Fahrenhit", 451,
                "Ray Bradbury", 1953));
        book.add(new Book("Araba Sevdası", 320,
                "Recaizade Mahmut Ekrem", 1896));
        

        for (Book books : book){
            System.out.println(" Kitap Adı : " + books.getBookName()+
                    "\n Sayfa Sayısı : " + books.getPageOfNumber()+
                    "\n Yazar : " + books.getWriterName()+
                    "\n Yayın Tarihi : " + books.getReleaseDate());
            System.out.println("----------------------------------");
        }


    }
}
