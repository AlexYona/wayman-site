package me.wayman.wayman_site;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";  // templates/index.html
    }

    @GetMapping("/contacts")
    public String contacts() {
        return "contacts";  // templates/index.html
    }

    @GetMapping("/about")
    public String about() {
        return "about";  // templates/about.html
    }
}