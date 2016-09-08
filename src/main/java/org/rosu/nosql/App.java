package org.rosu.nosql;

import org.rosu.nosql.entity.Note;
import org.rosu.nosql.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App {
    @Autowired
    private NoteRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

/*    @Override
    public void run(String... strings) throws Exception {
        repository.deleteAll();

        // save a couple of notes
        repository.save(new Note("foo", "TestText"));
        repository.save(new Note("test1", "TestText2"));

        // fetch all notes
        System.out.println("Notes found with findAll():");
        System.out.println("-------------------------------");
        for (Note note : repository.findAll()) {
            System.out.println(note);
        }
        System.out.println();

        // fetch an individual note
        System.out.println("Note found with findByHeader('foo'):");
        System.out.println("--------------------------------");
        System.out.println(repository.findByHeader("foo"));

        System.out.println("Notes found with findByText('TestText'):");
        System.out.println("--------------------------------");
        for (Note note : repository.findByText("TestText")) {
            System.out.println(note);
        }
    }*/
}
