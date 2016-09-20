package org.rosu.nosql.mvc.controller;

import org.rosu.nosql.entity.Person;
import org.rosu.nosql.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by rsurvilas on 2016.09.07.
 */
@Controller
public class HomeController {
    @Autowired
    private PersonRepository repository;


    @RequestMapping("/home")
    public String home(@RequestParam(value = "name", required = false)
                                   String name, Model model) {
        model.addAttribute("helloName", name);

        //Save to DB
        repository.save(new Person(name, "de "+name));



        model.addAttribute("vardai", repository.findAll());



        return "home";
    }
}
