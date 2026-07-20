package com.example.SpringBootWebApp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @ModelAttribute("course")
    public String courseName() {
        return "Java";
    }

    @RequestMapping("/")
    public String Home() {
    	System.out.println("Home");
        return "index";
    }

    @RequestMapping("add")
//    public String Add(@ModelAttribute Alien alien) {
//    public String Add(@ModelAttribute("alien1") Alien alien) {
    public String Add(Alien alien) {
        return "result";
    }
}
