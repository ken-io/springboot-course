package io.ken.springboot.course.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping("/")
    @ResponseBody
    String index() {
        return "Hello World!";
    }

    @RequestMapping("/welcome")
    ModelAndView welcome(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("welcome");
        modelAndView.addObject("message","Welcome to Spring Boot & Freemarker");
        return modelAndView;
    }
}
