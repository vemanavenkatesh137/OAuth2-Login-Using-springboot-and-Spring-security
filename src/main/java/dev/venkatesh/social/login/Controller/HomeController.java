package dev.venkatesh.social.login.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "Home!";
    }

    @GetMapping("/secured")
    public String secured(){
        return "Secured!";
    }
}
