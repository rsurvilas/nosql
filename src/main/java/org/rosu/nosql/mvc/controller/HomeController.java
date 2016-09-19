package org.rosu.nosql.mvc.controller;

import org.rosu.nosql.entity.Note;
import org.rosu.nosql.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rsurvilas on 2016.09.07.
 */
@Controller
public class HomeController {
    @Autowired
    private NoteRepository repository;

    final static String NAME="C_NAME";

    @RequestMapping("/home")
    public String home(@RequestParam(value = "name", required = false)
                                   String name, Model model) {
        model.addAttribute("name", name);

        //Save to DB
        repository.save(new Note(NAME, name));



        System.out.println("Visi vardai:");
        System.out.println("-------------------------------");
        List names = new ArrayList<String>();
        for (Note note : repository.findAll()) {
            if (note.getHeader().equals(NAME)) {
                System.out.println(note.getText());
                names.add(note.getText());
            }
        }



        return "home";
    }
}
