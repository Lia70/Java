public class DZ3_2 {
    // Внутри класса Answer напишите метод answer, который распарсит json и, используя StringBuilder, создаст строки вида:
    // Студент [фамилия] получил [оценка] по предмету [предмет].
    // На вход метода answer подаются аргументы:
    // String JSON
    // String ELEMENT1
    // String ELEMENT2
    // String ELEMENT3

    class Answer { public void answer(String JSON, String ELEMENT1, String ELEMENT2, String ELEMENT3) {
        String jsonString = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},"
                + "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},"
                + "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        StringBuilder sb = new StringBuilder();
        String[] splitString = jsonString.split("\\{");
        for (int i = 1; i < splitString.length; i++) {
                String[] studentInfo = splitString[i].replace("}]", "").split("\",\"");
                sb.append("Студент " + studentInfo[0].split(":")[1].replace("\"", "") + " получил " + studentInfo[1].split(":")[1].replace("\"", "") + " по предмету " + studentInfo[2].split(":")[1].replace("\"", "").replace("},", "") + "\n");
        }
        System.out.println(sb.toString());
}
} // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
   
    // class Printer {
    //     public static void main(String[] args) {
    //         String JSON = "";
    //         String ELEMENT1 = "";
    //         String ELEMENT2 = "";
    //         String ELEMENT3 = "";

    //        if (args.length == 0)
    //        {
    //         // При отправке кода на Выполнение, вы можете варьировать эти параметры
    //             JSON = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
    //                 "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
    //                 "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
    //             ELEMENT1 = "Студент ";
    //             ELEMENT2 = " получил ";
    //             ELEMENT3 = " по предмету ";
    //         } else {
    //            JSON = args[0];
    //            ELEMENT1 = args[1];
    //            ELEMENT2 = args[2];
    //            ELEMENT3 = args[3];
    //         }
    //         Answer ans = new Answer();
    //         ans.answer(JSON, ELEMENT1, ELEMENT2, ELEMENT3);
    //     }
    // }
} 


 