package sg.edu.rp.c346.demodatabasecrud;

/**
 * Created by 15017103 on 18/5/2017.
 */

public class Note {
    private int id;
    private String noteContent;

    public Note(int id, String noteContent) {
        this.id = id;
        this.noteContent = noteContent;
    }

    public int getId() {
        return id;
    }

    public String getNoteContent() {
        return noteContent;
    }
}
