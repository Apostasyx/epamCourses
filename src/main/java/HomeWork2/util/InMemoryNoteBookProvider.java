package HomeWork2.util;

import HomeWork2.entity.Note;
import HomeWork2.entity.NoteBook;
import HomeWork2.entity.NoteType;

import java.time.LocalDate;

public class InMemoryNoteBookProvider implements NoteBookProvider {
    private static InMemoryNoteBookProvider _instance = null;
    private NoteBook[] noteBooks;

    private InMemoryNoteBookProvider() {

    }

    public static InMemoryNoteBookProvider getInstance() {
        if (_instance == null) {
            _instance = new InMemoryNoteBookProvider();
        }
        return _instance;
    }

    {
        LocalDate date = LocalDate.now();
        noteBooks = new NoteBook[] {
                new NoteBook(new Note[] {
                        new Note("Опять работать?!", date, NoteType.NOTE),
                        new Note("Нам нужно больше золота!", date, NoteType.NOTE)
                }),

                new NoteBook(new Note[] {
                        new Note("За моего отца, короля!", date, NoteType.NOTE),
                        new Note("Не могу стоять, пока другие работают... Пойду полежу.", date, NoteType.TASK)
                }),

                new NoteBook(new Note[] {
                        new Note("Быстро и дешево выполню любую халтуру!", date, NoteType.TASK),
                        new Note("Вскрытие показало, что больной спал.", date, NoteType.NOTE)
                })
        };
    }

    @Override
    public NoteBook getRandomItemFromNoteBooks() {
        return noteBooks[(int) (Math.random() * (noteBooks.length))];
    }

    @Override
    public Note getRandomItemFromNotes() {
        NoteBook temp = getRandomItemFromNoteBooks();
        return temp.getNotes()[(int) (Math.random() * (temp.getCount()))];
    }

    @Override
    public NoteBook[] getNoteBooksArray() {
        return noteBooks;
    }
}
