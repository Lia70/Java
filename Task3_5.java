import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Task3_5 {
    // Написать прогр., опред-ю правильность расстановки скобок в выражении.
    // Н, a + (d * 3) - true
    //  [a + (1 * 3]) - false
    //  [6 + (3 * 3)] - true
    //  {a}[+]{(d*3)} - true
    //  <{a}+{(d*3)}> - true
    //  {a+]}{(d*3)} - false
    public static void main(String[] args) {
        String primer1 = "a+(d*3)";
        String primer2 = "[a+(1*3])";
        String primer3 = "<{a}+{(d*3)}>";
        String primer4 = "{a+]}{(d*3)}";
        System.out.println(checkPrimer(primer1));
        System.out.println(checkPrimer(primer2));
        System.out.println(checkPrimer(primer3));
        System.out.println(checkPrimer(primer4));
    }

    static boolean checkPrimer(String primer){
        Stack<Character> stack = new Stack<>();
        char[] arr = primer.toCharArray();
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('<', '>');
        map.put('{', '}');

        for (char cur: arr){
            if (map.containsKey(cur)){
                stack.push(cur);
            }
            if (map.containsValue(cur)){
                if (stack.empty() || map.get(stack.pop()) != cur){
                    return false;
                }
            }
        }
        return stack.empty();
    }
    
}
