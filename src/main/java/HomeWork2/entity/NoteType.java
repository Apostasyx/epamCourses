package HomeWork2.entity;

public enum NoteType {
    NOTE("Записка"),
    TASK("Задача");

    private String type;

    NoteType(String type) {
        this.type = type;
    }

    public String getRusName() {
        return this.type;
    }
}
