import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Task4_5 {
    // Взять набор строк, Н, 
    // Мороз и солнце день чудесный
    // еще ты дремлешь друг прелестный
    // Пора красавица проснись.
    // написать метод, кот-ый отсорт-т эти слова по длине 
    // с пом-ю TreeMap. Слова с один-й длиной не должны "потеряться"
    
    public static void main(String[] args) {
        String line = "Мороз и солнце день чудесный\n" +
                "еще ты дремлешь друг прелестный\n" +
                "Пора красавица проснись";
        Map<Integer, List<String>> map = new TreeMap<>();
        line = line.replace("\n", " ").replace(".", "");
        String[] words = line.split(" ");
        for (String word: words){
            int len = word.length();
            if (map.containsKey(len)){
                List<String> list = map.get(len);
                list.add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(len, list);
            }
        }

        System.out.println(map);
    }
}
