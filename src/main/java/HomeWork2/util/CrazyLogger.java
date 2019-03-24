package HomeWork2.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CrazyLogger {
    private final DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-YYYY : HH-mm – ");
    private StringBuilder logger = new StringBuilder();
    private static CrazyLogger _instance = null;

    private CrazyLogger() {

    }

    public static CrazyLogger getInstance() {
        if (_instance == null)
            _instance = new CrazyLogger();

        return _instance;
    }

    public void addMessage(String message) {
        logger.append(getCurrentTime())
                .append(message)
                .append("\n");
    }

    public void showAllMessages() {
        for (String message : logger.toString().split("\n")) {
            System.out.println(message);
        }
    }

    public void showMessages(String message) {
        String[] temp = logger.toString().split("\n");
        if (logger.length() == -1) {
            System.out.println("logger is empty");
        } else {
            System.out.println("messages that contain \"" + message + "\" : ");
            for (String string : temp) {
                if (string.contains(message))
                    System.out.println(string);
            }
        }
    }

    private String getCurrentTime() {
        LocalDateTime currentTime = LocalDateTime.now();
        return currentTime.format(format);
    }
}
