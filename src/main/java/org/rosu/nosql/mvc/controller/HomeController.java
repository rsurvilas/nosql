package org.rosu.nosql.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by rsurvilas on 2016.09.07.
 */
@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home(@RequestParam(value = "name", required = false)
                                   String name, Model model) {
        model.addAttribute("name", name);

        return "home";
    }
}
