import java.util.HashMap;
import java.util.Map;

public class Task2_5 {
    // Даны 2 строки, написать метод, кот-й вернет true,если эти строки явл-ся изоморф-ми и false, если нет.
    // Строки изоморфны, если 1 букву в 1-слове можно заменить на некот-ю букву во 2-слове. 
    // При этом повт-ся буквы одного слова меняются на 1 и ту же букву с сохр-м порядка след-я.
    // Н, add - egg  изоморфны
    // note - code, буква может не меняться, а ост-ся такой же
    // Input: s = "foo", t = "bar"  Output: false
    // Input: s = "paper", t = "title"  Output: true
    
    public static void main (String[] args){
        String s1 = "paper";
        String s2 = "title";
        String s3 = "foo";
        String s4 = "bar";
        System.out.println(izomorf(s1, s2));
        System.out.println(izomorf(s3, s4));
        System.out.println(izomorf(s4, s3));
    }
    public static boolean izomorf(String s1, String s2){
        if (s1.length()!=s2.length()){
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        for (int i = 0; i < s1.length(); i++) {
            if (map.containsKey(c1[i])){
                if (map.get(c1[i]) != c2[i]){
                    return false;
                }
            }
            else{
                if (map.containsValue(c2[i])){
                    return false;
                }
                map.put(c1[i],c2[i]);
            }
        }
        return true;
    }

}
