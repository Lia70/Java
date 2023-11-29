import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task1_3 {
    // Даны след-е строки, сравнить из с пом-ю == и метода
    // equals() класса Object
    // Strings1 = "Hello";
    // Strings2 = "Hello";
    // Strings3 = s1;
    // Strings4 = "h" + "e" + "l" + "l" + "o";
    // Strings5 = new String("Hello");
    // Strings6 = new String(new char[]{"H","e","l","l","o"});
        public static void main(String[] args) {
        List<Integer> a = masRandom(5, 1, 5);
        System.out.println(a);
        a.sort(null);
        System.out.println(a);
    }

    public static List<Integer> masRandom(int count, int min, int max){
        List<Integer> mas = new ArrayList<>(count);
        Random rand = new Random();
        for (int i = 0; i < count; i++) {
            mas.add(rand.nextInt(min, max+1));
        }
        return mas;
    }
}
