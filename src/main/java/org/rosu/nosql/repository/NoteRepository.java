package org.rosu.nosql.repository;

import java.util.List;

import org.rosu.nosql.entity.Note;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NoteRepository extends MongoRepository<Note, String> {
    /**
     * Finds a Note by header.
     *
     * @param header - header to search.
     *
     * @return Note that is found by given header.
     */
    Note findByHeader(String header);

    /**
     * Finds a list of Notes by similar text.
     *
     * @param text - text to search.
     *
     * @return A list of Notes that are found by given text.
     */
    List<Note> findByText(String text);
}
