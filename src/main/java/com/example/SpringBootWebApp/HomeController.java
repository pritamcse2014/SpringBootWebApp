package com.example.SpringBootWebApp;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
    public String Home() {
    	System.out.println("Home");
        return "index.jsp";
    }
}
