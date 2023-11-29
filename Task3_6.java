import java.util.HashSet;
import java.util.Set;
// Продумайте стр-ру класса Кот. Какие поля и методы будут актуальны для прил-я, кот-е явл-ся:
// а) инф-й системой ветерин-й клиники
// б) архивом выставки котов
// в) инф-й системой Театра кошек Ю.Д.Куклачева
// Можно записать в текст-м виде, не обяз-но реал-ть в java

// 1. Реал-те 1 из вар-в класса  из пред-го задания,
// можно исп-ть не все придум-е поля и методы. Выведите их в консоль
// 2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, 
// выводилась его кличка, цвет и возраст(или др. парам.)
// 1) Создайте мн-во, в кот-м будут хр-ся экземпл. класса Cat - HashSet<Cat>
// поместите в него некот-е кол-во объектов
// 2) Создайте 2 или более котов с один-ми парам-ми в полях. Помес-те их во мн-во.
// Убедитесь что все сохр-сь во мн-во
// 3) Создайте метод public boolean equals(Object o)
// Пропишите в нем логику срав-я котов по парам-м, хран-м в полях
// Т.е., метод должен возвр-ть , только если знач-я во всех срав-х объектах равны.
// 4) Выведите снова сод-е мн-ва из пункта 2, убедитесь что дубликаты удалились.

public class Task3_6 {
    public static void main(String[] args) {
        Set<Cat> cats = new HashSet<>();

        Cat cat1 = new Cat();
        cat1.name = "Барсик";
        cat1.age = 10;
        cat1.poroda = "Сфинкс";
        cat1.owner = "Иван Иванович";

        Cat cat2 = new Cat();
        cat2.name = "Мурзик";
        cat2.age = 9;
        cat2.poroda = "Британец";
        cat2.owner = "Мария Ивановна";

        Cat cat3 = new Cat();
        cat3.name = "Машка";
        cat3.age = 11;
        cat3.poroda = "Сибирская";
        cat3.owner = "Петр Семенович";

        Cat cat4 = new Cat();
        cat4.name = "Жорик";
        cat4.age = 10;
        cat4.poroda = "Персидская";
        cat4.owner = "Кирил Иванович";

        Cat cat5 = new Cat();
        cat5.name = "Жорик";
        cat5.age = 10;
        cat5.poroda = "Персидская";
        cat5.owner = "Кирил Иванович";

        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);

        print(cats);
        System.out.println();
        print(selectByAge(cats, 10));
    }

    static Set<Cat> selectByAge(Set<Cat> cats, int minAge){
        Set<Cat> result = new HashSet<>();
        for (Cat cat: cats){
            if (cat.age >= minAge){
                result.add(cat);
            }
        }
        return result;
    }

    static void print(Set<Cat> cats){
        for (Cat cat: cats){
            System.out.println(cat);
        }
    }
    
}
