package ru.sbrf.helloApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/hello")
    public String greering(@RequestParam(defaultValue = "world") String name) {
        return String.format("Hello, %s", name);
    }
}
