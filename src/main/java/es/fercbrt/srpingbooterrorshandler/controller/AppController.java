package es.fercbrt.srpingbooterrorshandler.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class AppController {
    @GetMapping
    String index() {
        // This will throw an ArithmeticException
        //int value = 100 / 0;
        // This will throw a NumberFormatException
        int value = Integer.parseInt("abc");
        return "Hello World!";
    }
}
