package es.fercbrt.srpingbooterrorshandler.controller;

import es.fercbrt.srpingbooterrorshandler.models.User;
import es.fercbrt.srpingbooterrorshandler.models.UserNotFoundException;
import es.fercbrt.srpingbooterrorshandler.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/controller")
public class AppController {

    @Autowired
    private UserService userService;

    @GetMapping
    String index() {
        // This will throw an ArithmeticException
        //int value = 100 / 0;
        // This will throw a NumberFormatException
        //int value = Integer.parseInt("abc");
        return "Hello World!";
    }

    @GetMapping("/users")
    ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok(userService.findAll());
    }

    @GetMapping("/users/{id}")
    ResponseEntity<User> getUser(@PathVariable Long id) {
        User user = userService.findById(id);
        if (user == null) {
            throw new UserNotFoundException("User not found with id: " + id);
        }
        return ResponseEntity.ok(user);
    }
}
