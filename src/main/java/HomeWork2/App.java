package HomeWork2;

import HomeWork2.entity.NoteBook;
import HomeWork2.util.*;

public class App {
    private static CrazyLogger logger = CrazyLogger.getInstance();

    public static void main(String[] args) {
        NoteBookProvider nbp = InMemoryNoteBookProvider.getInstance();

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
        NoteBookView nbv = new NoteBookView() {
            @Override
            public void printArrayOfNoteBook(NoteBook[] noteBooks) {
                logger.addMessage("Вывод на экран всего массива NoteBook");
                for (NoteBook noteBook : noteBooks) {
                    System.out.println(noteBook.toString());
                }
            }
        };
        nbv.printArrayOfNoteBook(nbp.getNoteBooksArray());

        logger.showAllMessages();
        System.out.println();
        logger.showMessages("Получение случайного значения из Notes");
    }
}
