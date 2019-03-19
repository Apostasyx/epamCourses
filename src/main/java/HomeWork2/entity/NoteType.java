package HomeWork2.entity;

public enum NoteType {
    NOTE,
    TASK;

    public static String getRusName(NoteType noteType){
        String result = (noteType == NOTE) ? "Записка" : "Задача";

        return result;
    }
}
