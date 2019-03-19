package HomeWork2.util;

import HomeWork2.entity.Note;
import HomeWork2.entity.NoteBook;
import HomeWork2.entity.NoteType;

import java.util.Date;

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
        noteBooks = new NoteBook[] {
                new NoteBook(new Note[] {
                        new Note("Опять работать?!", new Date(), NoteType.NOTE),
                        new Note("Нам нужно больше золота!", new Date(), NoteType.NOTE)
                }),

                new NoteBook(new Note[] {
                        new Note("За моего отца, короля!", new Date(), NoteType.NOTE),
                        new Note("Не могу стоять, пока другие работают... Пойду полежу.", new Date(), NoteType.TASK)
                }),

                new NoteBook(new Note[] {
                        new Note("Быстро и дешево выполню любую халтуру!", new Date(), NoteType.TASK),
                        new Note("Вскрытие показало, что больной спал.", new Date(), NoteType.NOTE)
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
