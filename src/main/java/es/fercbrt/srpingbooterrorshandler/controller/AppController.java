package es.fercbrt.srpingbooterrorshandler.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class AppController {
    @GetMapping
    String index() {
        return "Hello World!";
    }
}
