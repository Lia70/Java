public class Task1_2 {
    // Дано четное число N (>0) и символы c1, c2
    // Написать метод, кот-й вернет строку длины N, которая
    // состоит из чередующихся символов с1, с2; начиная с с1 
    public static void main(String[] args){
        System.out.println(nCount(6, 'a', 'b'));
    }
    static String nCount(int N, char c1, char c2){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++){
            if (i % 2 == 0){
                sb.append(c1);
            }
            else sb.append(c2);
        }
        return sb.toString();
    } 
}
