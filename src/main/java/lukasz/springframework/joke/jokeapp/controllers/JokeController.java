package lukasz.springframework.joke.jokeapp.controllers;

import lukasz.springframework.joke.jokeapp.services.JokeServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeServiceImpl jokeServiceImpl;

    public JokeController() {
        this.jokeServiceImpl = new JokeServiceImpl();
    }
    @RequestMapping({"/", ""})
    public String showJoke(Model model) {
        model.addAttribute("joke", jokeServiceImpl.getJoke());
        return "chuckNorris";
    }
}
