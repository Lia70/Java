import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task4_2 {
    // Напишите метод, кот-й сост-т строку, сост-ю из 100 повт-й слова Test&
    // И метод, кот-й запишет эту строку в простой текст-й файл, обраб-те искл-я
    static Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) {
        String filePath = "Java/Task4_2/test.txt";
        String logPath = "Java/Task4_2/log.txt";
        String s = "Test";
        int n = 5;

        createLogger(logPath);
        String s1 = repeat(s, n);
//        System.out.println(s1);
        saveToFile(s1, filePath);
        System.out.println(readFile(filePath));
        closeLogger();
    }

    static void closeLogger() {
        Handler[] handlers = logger.getHandlers();
        for (Handler handler: handlers){
            handler.close();
        }
    }

    static void createLogger(String logPath) {
        try {
            FileHandler handler = new FileHandler(logPath, true);
            logger.addHandler(handler);
            SimpleFormatter formatter = new SimpleFormatter();
            handler.setFormatter(formatter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void saveToFile(String s, String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(s);
            logger.info("Р—Р°РїРёСЃСЊ РїСЂРѕС€Р»Р° СѓСЃРїРµС€РЅРѕ");
        } catch (Exception e) {
            e.printStackTrace();
            logger.warning("РќРµ СѓРґР°Р»РѕСЃСЊ Р·Р°РїРёСЃР°С‚СЊ РІ С„Р°Р№Р»");
        }
    }

    static String readFile(String filePath) {
        File file = new File(filePath);
        StringBuilder stringBuilder = new StringBuilder();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                stringBuilder.append(scanner.nextLine());
                stringBuilder.append("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    static String repeat(String s, int n) {
        s = s.toUpperCase();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(s);
            stringBuilder.append(" ");
        }
//        return s.repeat(n);
        return stringBuilder.toString();
    }
}

