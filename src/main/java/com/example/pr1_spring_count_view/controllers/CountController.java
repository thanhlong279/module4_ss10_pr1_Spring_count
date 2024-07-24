package com.example.pr1_spring_count_view.controllers;

import com.example.pr1_spring_count_view.models.Counter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("counter")
public class CountController {
    @ModelAttribute("counter")
    public Counter getCounter() {
        return new Counter();
    }

    @GetMapping
    public String get(@ModelAttribute("counter")Counter counter){
        counter.increment();
        return "/index";
    }
}
