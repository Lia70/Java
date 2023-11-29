import java.util.Arrays;
public class Task3 {
    // Дан массив nums = [3,2,5,3] и число val = 3
    // Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
    // Т.о., первые неск-ко (или все) элементов массива д.б. отличны от заданного, 
    // а остальные - равны ему.

    public static void main(String[] args) {
        int[] nums = {3,2,5,3};
        int val = 3;
        System.out.println(Arrays.toString((sort(nums, val))));
    }
    public static int[] sort(int[] mas, int val){
        int count = 0; int countRev = 1;
        int[] masSorted = new int[mas.length];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == val){
                masSorted[mas.length - countRev] = val;
                countRev++;
            }
            else{
                masSorted[count] = mas[i];
                count++;
            }
        }
        return masSorted;
    }

}
