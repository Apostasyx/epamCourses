package HomeWork2.util;

import HomeWork2.entity.Note;
import HomeWork2.entity.NoteBook;

public class NoteBookConsoleView {
    private static CrazyLogger logger = CrazyLogger.getInstance();

    public static void print(Note note) {
        logger.addMessage("Вывод записи из Note");
        System.out.println(note.toString());
    }

    public static void print(Note ... notes) {
        logger.addMessage("Вывод записей из Note");
        for (Note note : notes) {
            System.out.println(note.toString());
        }
    }

    public static void print(NoteBook noteBook) {
        logger.addMessage("Вывод NoteBook");
        System.out.println(noteBook.toString());
    }
}
