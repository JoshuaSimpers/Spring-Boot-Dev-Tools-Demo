package com.luv2code.springboot.demo.SpringBootDemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// defines the class as a REST controller
@RestController
public class FunRestController {

    // expose "/" that returns "Hello World"

    // tells the application what to do when accessing the "/" location
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    // expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Workout? Nah I just don't eat.";
    }
}
