public class Task5 {
    // Реализовать ф-ю возведения числа а в степень b. a ,b из Z 
    // a = 3, b = 2, ответ: 9
    // a = 2, b = -2, ответ: 0,25
    // a = 3, b = 0, ответ: 1
    public static void main(String[] args){
        int a = 3;
        int b = 0;
        System.out.println(pow(a, b));
    }
    static double pow(double a, int b){
        if (b == 0 || a == 1) {
            return 1;
        }
        if (b < 0){
            a = 1.0 / a;
            b = -b;
        }
        double res = a;
        for (int i = 1; i < b; i++){
            res *= a;
        }
        return res;
    }
}


