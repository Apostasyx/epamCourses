package HomeWork2.util;

import HomeWork2.entity.Note;
import HomeWork2.entity.NoteBook;

public class NoteBookConsoleView {
    public static void print(Note note) {
        System.out.println(note.toString());
    }

    public static void print(Note ... notes) {
        for (Note note : notes) {
            System.out.println(note.toString());
        }
    }

    public static void print(NoteBook noteBook) {
        System.out.println(noteBook.toString());
    }
}
