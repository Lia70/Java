import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
// Напишите метод, кот-й заполнит массив из 1000 Э-в случ-ми цифрами 0-24
// Создайте метод, в кот-й передайте запол-й выше массив
// и с пом-ю Set вычис-те % уник-х знач-й в данном массиве
// и верните его в виде числа с плав-й запятой.
// Ф-ла для вычис-я %: 
// % уник-х чисел = кол-во уник-х чисел * 100 / общее кол-во чисел в массиве


public class Task2_6 {
        public static void main(String[] args) {
        Integer[] arr = generateArray(0, 24, 1000);
        System.out.println(Arrays.toString(arr));
        System.out.println(uniqPercent(arr));
    }

    static double uniqPercent(Integer[] arr){
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        return set.size() * 100.0 / arr.length;
    }

    static Integer[] generateArray(int min, int max, int n){
        Random random = new Random();
        Integer[] res = new Integer[n];
        for (int i = 0; i < n; i++) {
            res[i] = random.nextInt(min, max+1);
        }
        return res;
    }
}
