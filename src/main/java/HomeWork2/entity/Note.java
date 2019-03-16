package HomeWork2.entity;

import java.util.Date;
import java.util.Objects;

public class Note {
    private String text;
    private Date date;

    public Note(String text, Date date) {
        if ((text == null) || (date == null)) {
            throw new RuntimeException("object fields are null");
        }
        this.text = text;
        this.date = date;
    }

    @Override
    public String toString() {
        return "[" + date + "]" + " [" + text + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return text.equals(note.text) &&
                date.equals(note.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, date);
    }
}
