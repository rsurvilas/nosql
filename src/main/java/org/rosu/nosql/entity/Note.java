package org.rosu.nosql.entity;

import org.springframework.data.annotation.Id;

public class Note {
    @Id
    private String id;
    private String header;
    private String text;

    public Note() {}

    public Note(String header, String text) {
        this.header = header;
        this.text = text;
    }

    @Override
    public String toString() {
        return String.format("Note[id=%s, header='%s', text='%s']",
                id, header, text);
    }
}
