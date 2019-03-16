package HomeWork2.entity;

import java.util.Arrays;

public class NoteBook {
    private Note[] notes;

    public NoteBook(Note[] notes) {
        if ((notes == null) || (notes.length == 0)) {
            throw new RuntimeException("note array can't be equals null or note.length equals 0");
        }
        this.notes = notes;
    }

    public Note[] getNotes() {
        return notes;
    }

    public void setNotes(Note[] notes) {
        this.notes = notes;
    }

    public int getCount() {
        return notes.length;
    }

    @Override
    public String toString() {
        if (notes.length == 0) return "note is empty";

        StringBuilder result = new StringBuilder();
        for (Note note : notes) {
            result.append(note.toString() + '\n');
        }

        return new String(result);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NoteBook noteBook = (NoteBook) o;
        return Arrays.equals(notes, noteBook.notes);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(notes);
    }
}
