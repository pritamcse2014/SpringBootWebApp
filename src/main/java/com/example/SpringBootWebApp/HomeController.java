package com.example.SpringBootWebApp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String Home() {
    	System.out.println("Home");
        return "index";
    }

    @RequestMapping("add")
    public ModelAndView Add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView model) {
        System.out.println("Add");
        int result = num1 + num2 + 1;
        model.addObject("result", result);
        model.setViewName("result");
        return model;
    }
}
