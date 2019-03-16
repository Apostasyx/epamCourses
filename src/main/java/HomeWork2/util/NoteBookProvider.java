package HomeWork2.util;

import HomeWork2.entity.Note;
import HomeWork2.entity.NoteBook;

import java.util.Date;

public class NoteBookProvider {
    private static NoteBookProvider _instance = null;
    private NoteBook[] noteBooks;

    private NoteBookProvider() {

    }

    public static NoteBookProvider getInstance() {
        if (_instance == null) {
            _instance = new NoteBookProvider();
        }

        return _instance;
    }

    {
        noteBooks = new NoteBook[] {
          new NoteBook(new Note[] {
                  new Note("Опять работать?!", new Date()),
                  new Note("Нам нужно больше золота!", new Date())
          }),

          new NoteBook(new Note[] {
                  new Note("За моего отца, короля!", new Date()),
                  new Note("Не могу стоять, пока другие работают... Пойду полежу.", new Date())
          }),

          new NoteBook(new Note[] {
                  new Note("Быстро и дешево выполню любую халтуру!", new Date()),
                  new Note("Вскрытие показало, что больной спал.", new Date())
          })
        };
    }

    public NoteBook getRandomItemFromNoteBooks() {
        return noteBooks[(int) (Math.random() * (noteBooks.length))];
//        return null;
    }

    public Note getRandomItemFromNotes() {
        NoteBook temp = getRandomItemFromNoteBooks();
        return temp.getNotes()[(int) (Math.random() * (temp.getCount()))];
    }

    public NoteBook[] getNoteBooksArray() {
        return noteBooks;
    }
}
