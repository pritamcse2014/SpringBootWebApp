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
    public ModelAndView Add(@RequestParam("id") int id, @RequestParam("name") String name, ModelAndView model) {
        System.out.println("Add");
        Alien alien =new Alien();
        alien.setId(id);
        alien.setName(name);
        model.addObject("alien", alien);
        model.setViewName("result");
        return model;
    }
}
