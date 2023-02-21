
package pratkich3_onm_4var;




import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class Bookshelf {    /// ������� ����� ������� �����
    private static int counter = 0;  /// ������� ��������� �������, �� ����� ���������� ����� �����
    private List<Book> booksList = new ArrayList<>(); /// ������� ��������� �����-������, ������� ����� ��������� ��� ������ "BOOK"
    public static final String ANSI_GREEN  = "\u001B[32m"; /// ������ ���� ��� �������, ���� ��������
    public static final String ANSI_RESET  = "\u001B[0m";
    public static final String ANSI_BLUE  = "\u001B[34m";

   
    
  
    public void addBooks(int numBooks) { /// ������� �����, ������� ����� ��������� ����� � ���������� �� �� �����
        Scanner scanner = new Scanner(System.in);
        
        counter++;
        for (int i = 1; i <= numBooks; i++) {
            
            System.out.print("������� ����� ����� " + i + " ����� ��� ������� " + counter + " : ");
            String id = scanner.nextLine();
            System.out.print("������� �������� ����� " + i + " ����� ��� ������� " + counter + " : ");
            String name = scanner.nextLine();
            System.out.print("������� ���� ����� " + i + " ����� ��� ������� " + counter + " : ");
            String genre = scanner.nextLine();
            Book newBook = new Book(id, name, genre);
            booksList.add(newBook);
        }
    
    }
    public void showBooks(){ /// ����� ��� ����������� ����
        for(Book e: booksList){
            System.out.println(e);
        }
    }

    private class Book {  /// ����� �����, ������� ����� �����, ��� � ����

        @Override
        public String toString() {
            return ANSI_GREEN +  "�� �������� ����� �� ����� :"+  counter + " : " + ANSI_BLUE + "{" + "����� ����� : " + id + ", �������� ����� : " + name + ", ���� ����� : " + genre + '}'+ ANSI_RESET;
        }
        private String id;
        private String name;
        private String genre;

        public Book(String id, String name, String genre) { /// ������� �����������, ��� ��� �� ���� ������� ����� ������������
            this.id = id;                                   /// ������ �� ������ �����, ����� ������ �� ���������
            this.name = name;
            this.genre = genre;
        }
    
    
    
    }
   




}

