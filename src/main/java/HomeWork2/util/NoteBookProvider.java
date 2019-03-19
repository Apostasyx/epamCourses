package HomeWork2.util;

import HomeWork2.entity.Note;
import HomeWork2.entity.NoteBook;

public interface NoteBookProvider {
    NoteBook getRandomItemFromNoteBooks();
    Note getRandomItemFromNotes();
    NoteBook[] getNoteBooksArray();
}
