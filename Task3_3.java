import java.util.ArrayList;
import java.util.List;

public class Task3_3 {
    // Создать список типа ArraList<String>.
    // Поместить в него как строки, так и целые числа.
    // Пройти по списку, найти и удалить целые числа.
    // Каталог товаров книжного магазина сохранен в виде двумерного списка ArraList<String>.
    // так, что на 0 позиции каждого внутр-го списка назв. жанра, а на ост-х позициях-
    // назв. книг. Напишите метод для запол-я дан-й струк-ры, только уник-е знач-я.
    
    public static void main(String[] args) {
        List<List<String>> shopBook = new ArrayList<>();
        addBook(shopBook, "Роман", "Войнв и мир");
        addBook(shopBook, "Сказка", "Золотой ключик");
        addBook(shopBook, "Роман", "Мастер и Маргарита");
        addBook(shopBook, "Фэнтези", "Гарри Поттер");
        addBook(shopBook, "Сказка", "Репка");
        addBook(shopBook, "Сказка", "Репка");
        addBook(shopBook, "Фэнтези", "Репка");

        System.out.println(shopBook);
    }

    static void addBook(List<List<String>> shopBook, String genre, String nameBook){
        for (int i = 0; i < shopBook.size(); i++) {
            List<String> curList = shopBook.get(i);
            if (curList.get(0).equalsIgnoreCase(genre)){
                if (!curList.contains(nameBook)){
                    curList.add(nameBook);
                }
                return;
            }
        }
        List<String> list = new ArrayList<>();
        list.add(genre);
        list.add(nameBook);
        shopBook.add(list);
    }
}
