
package pratkich3_onm_4var;




import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class Bookshelf {    /// Создаем класс Книжная полка
    private static int counter = 0;  /// Заводим статичный счетчик, он будет показывать какая полка
    private List<Book> booksList = new ArrayList<>(); /// Создаем вложенный класс-список, который будет принимать тип класса "BOOK"
    public static final String ANSI_GREEN  = "\u001B[32m"; /// Делаем цвет для красоты, чтоб отличать
    public static final String ANSI_RESET  = "\u001B[0m";
    public static final String ANSI_BLUE  = "\u001B[34m";

   
    
  
    public void addBooks(int numBooks) { /// Заводим метод, который будет принимать книги и отправлять их на полку
        Scanner scanner = new Scanner(System.in);
        
        counter++;
        for (int i = 1; i <= numBooks; i++) {
            
            System.out.print("Введите номер Книги " + i + " Полка под номером " + counter + " : ");
            String id = scanner.nextLine();
            System.out.print("Введите название Книги " + i + " Полка под номером " + counter + " : ");
            String name = scanner.nextLine();
            System.out.print("Введите жанр Книги " + i + " Полка под номером " + counter + " : ");
            String genre = scanner.nextLine();
            Book newBook = new Book(id, name, genre);
            booksList.add(newBook);
        }
    
    }
    public void showBooks(){ /// Метод для отображения книг
        for(Book e: booksList){
            System.out.println(e);
        }
    }

    private class Book {  /// Класс Книги, который имеет номер, имя и Жанр

        @Override
        public String toString() {
            return ANSI_GREEN +  "Вы Положили книгу на полку :"+  counter + " : " + ANSI_BLUE + "{" + "Номер книги : " + id + ", Название Книги : " + name + ", Жанр Книги : " + genre + '}'+ ANSI_RESET;
        }
        private String id;
        private String name;
        private String genre;

        public Book(String id, String name, String genre) { /// Создаем конструктор, Так как мы этим классом будем пользоваться
            this.id = id;                                   /// Только на уровне цикла, можно пустой не создавать
            this.name = name;
            this.genre = genre;
        }
    
    
    
    }
   




}

