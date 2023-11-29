public class Task3_2 {
    // Напишите метод, кот-й принимает на вход строку и опр-т явл-ся ли строка палиндромом
     
    // Вам дается строка S и целочисленный массив индексов index[s.length]
    // Напишите прогр., кот-я перетусует символы в S таким образом,
    // что символ с i-й позиции переместится на индекс index[i] в рез-й строке
    // Н, s="cba", index = [3,2,1]
    // рез. "abc"
    public static void main(String[] args) {
        String text = "A man, a plan  a canal, panama";
        System.out.println(isPolindrom(text));
    }
    static boolean isPolindrom(String text) {
        text = text.toLowerCase().replace(" ", "").replace(",", "").replace("-", "");
        StringBuilder sb = new StringBuilder(); //(text)
        for (int i = text.length()-1; i >= 0; i--) {
            sb.append(text.charAt(i));
        }
        // sb.reverse();
        return text.contentEquals(sb);
    }
}
