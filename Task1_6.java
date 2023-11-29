import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
// Создайте Hashset, заполните его след-ми числами {1,2,3,2,4,5,6,3}
// Распечатайте содер-е данного множ-ва
// Создайте LinkedHashSet, аполните его след-ми {1,2,3,2,4,5,6,3}
// Распечатайте содер-е данного множ-ва
// Содайте TreeSetб заполните его след-ми {1,2,3,2,4,5,6,3}
// Распечатайте содер-е данного множ-ва

public class Task1_6 {
    
        public static void main(String[] args) {
        Integer[] arr = {4, 5, 1, 2, 3, 2, 6, 3};

        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr));
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(arr));
        Set<Integer> set3 = new TreeSet<>(Arrays.asList(arr));

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
    }
}
