
package pratkich3_onm_4var;


public class Pratkich3_ONM_4var {


    public static void main(String[] args) {
       Bookshelf Number1 = new Bookshelf(); /// Заводим  новый объект а именно первую полку
       Number1.addBooks(2); /// Пишем сколько книг мы хотим добавить
       Number1.showBooks(); /// Метод покажет нам какие книги на данной полке и на какой они позиции
       Bookshelf Number2 = new Bookshelf(); //Новый объект, вторая полка
       Number2.addBooks(1); /// В нее мы добавим 1 книгу
       Number2.showBooks();
    }
    
}
