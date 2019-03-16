package HomeWork2;

import HomeWork2.util.NoteBookConsoleView;
import HomeWork2.util.NoteBookProvider;

public class App {
    public static void main(String[] args) {
        NoteBookProvider nbp = NoteBookProvider.getInstance();

        System.out.println("get random note");
        NoteBookConsoleView.print(nbp.getRandomItemFromNotes());
        System.out.println();

        System.out.println("get random notes");
        NoteBookConsoleView.print(nbp.getRandomItemFromNotes(), nbp.getRandomItemFromNotes(), nbp.getRandomItemFromNotes());
        System.out.println();

        System.out.println("get random notebook");
        NoteBookConsoleView.print(nbp.getRandomItemFromNoteBooks());
        System.out.println();

        System.out.println("get notebooks array");
        NoteBookConsoleView.print(nbp.getNoteBooksArray());
    }
}
