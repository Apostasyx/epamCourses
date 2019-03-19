package HomeWork2.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class NoteBookProviderTest {
    NoteBookProvider nbp = InMemoryNoteBookProvider.getInstance();

    @Test
    public void getRandomItemFromNoteBooks() {
        assertNotNull(nbp.getRandomItemFromNoteBooks());
    }

    @Test
    public void getRandomItemFromNotes() {
        assertNotNull(nbp.getRandomItemFromNotes());
    }
}