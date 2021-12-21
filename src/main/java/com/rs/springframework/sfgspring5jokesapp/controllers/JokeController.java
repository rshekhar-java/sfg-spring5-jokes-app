package com.rs.springframework.sfgspring5jokesapp.controllers;

import com.rs.springframework.sfgspring5jokesapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by rs 12/21/2021.
 */
@Controller
public class JokeController {
    private final JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping( {"/",""})
    public String  showJoke(Model model){
        model.addAttribute("joke",jokeService.getJoke());
        return "index";
    }


}
