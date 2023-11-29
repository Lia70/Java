import java.util.ArrayList;
import java.util.HashMap;

public class DZ1_5 {
    // Напишите программу, представляющую телефонную книгу. Программа должна иметь
    // следующие функции:
    // add(String name, Integer phoneNum): Добавляет запись в телефонную книгу.
    // Если запись с именем name уже существует, добавляет новый номер телефона в
    // существующую запись.
    // Если запись с именем name не существует, создает новую запись с этим именем и
    // номером телефона phoneNum.
    // find(String name): Поиск номеров телефона по имени в телефонной книге.
    // Если запись с именем name существует, возвращает список номеров телефона для
    // этой записи.
    // Если запись с именем name не существует, возвращает пустой список.
    // getPhoneBook(): Возвращает всю телефонную книгу в виде HashMap, где ключи -
    // это имена, а значения - списки номеров телефона.
    // public class Phonebook {
    // private int id;
    // private HashMap<Integer, Record> records = new HashMap<>();

    // /**
    // * Тип записи для хранения пары имя=телефон
    // */
    // private class Record {
    // private String name;
    // private String phone;

    // Record(String name, String phone) {
    // this.name = name;
    // this.phone = phone;
    // }

    // @Override
    // public int hashCode() {
    // return 31 * name.hashCode() + phone.hashCode();
    // }
    // }

    // Phonebook() {
    // this.id = -1;
    // }

    // /**
    // * Добавляет запись в телефонную книгу
    // *
    // * @param name имя
    // * @param phone телефон
    // */
    // public void add(String name, String phone) {
    // this.records.put(++this.id, new Record(name, phone));
    // }

    // /**
    // * Метод возвращает массив телефонов зарегистрированных на имя
    // *
    // * @param name имя
    // */
    // public ArrayList<String> get(String name) {
    // ArrayList<String> result = new ArrayList<>();
    // Set<HashMap.Entry<Integer, Record>> set = records.entrySet();
    // System.out.print(name + ": ");
    // for (HashMap.Entry<Integer, Record> o : set) {
    // if (o.getValue().name.toLowerCase().equals(name.toLowerCase()))
    // result.add(o.getValue().phone);
    // }
    // return result;
    // }

    // /**
    // * Метод показывает все записи телефонной книги
    // */
    // public void show() {
    // System.out.printf("%-4s%-7s%-17s\n", "id", "name", "phone");
    // Set<HashMap.Entry<Integer, Record>> set = records.entrySet();
    // for (HashMap.Entry<Integer, Record> o : set)
    // System.out.printf("%-4s%-7s%-17s\n", o.getKey(), o.getValue().name,
    // o.getValue().phone);
    // }
    // }

    class PhoneBook {
        private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

        public void add(String name, Integer phoneNum) {
            if (phoneBook.containsKey(name)) {
                phoneBook.get(name).add(phoneNum);
            } else {
                ArrayList<Integer> values = new ArrayList<>();
                values.add(phoneNum);
                phoneBook.put(name, values);
            }
        }

        public ArrayList<Integer> find(String name) {
            if (phoneBook.containsKey(name)) {
                return phoneBook.get(name);
            }
            return new ArrayList<Integer>();
        }

        public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
            return phoneBook;
        }
    }

    public class Printer {
        private static DZ1_5.PhoneBook myPhoneBook;

        public static void main(String[] args) {
            String name1;
            String name2;
            int phone1;
            int phone2;

            if (args.length == 0) {
                name1 = "Ivanov";
                name2 = "Petrov";
                phone1 = 123456;
                phone2 = 654321;
            } else {
                name1 = args[0];
                name2 = args[1];
                phone1 = Integer.parseInt(args[2]);
                phone2 = Integer.parseInt(args[3]);
            }

            // PhoneBook myPhoneBook = new PhoneBook();
            myPhoneBook.add(name1, phone1);
            myPhoneBook.add(name1, phone2);
            myPhoneBook.add(name2, phone2);

            System.out.println(myPhoneBook.find(name1));
            System.out.println(PhoneBook.getPhoneBook());
            System.out.println(myPhoneBook.find("Me"));
        }
    }
}