
// Вычислить n-ое треугольного число(сумма чисел от 1 до n),
// n! (произведение чисел от 1 до n)

class Answer {
  public int countNTriangle(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    return sum;
  }

public void printPrimeNums() {
}

public String answer(String qUERY, String pARAMS) {
    return null;
}
}

public class DZ1 {
  public static void main(String[] args) {
    int n = 0;

    if (args.length == 0) {
      // При отправке кода на Выполнение, вы можете варьировать эти параметры
      n = 5;
    } else {
      n = Integer.parseInt(args[0]);
    }

    // Вывод результата на экран
    Answer ans = new Answer();
    int itresume_res = ans.countNTriangle(n);
    System.out.println(itresume_res);
  }
}
