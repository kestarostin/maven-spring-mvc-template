package com.kestarostin.template.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Class MainController is a template controller class for Spring MVC app.
 * <p>
 * Created by Konstantin Starostin
 * on 07.12.2017.
 */
@Controller
public class MainController {

    /**
     * Shows main page.
     *
     * @param model The Model.
     * @return      The path.
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("message", "Hello World!");
        return "main";
    }
}
