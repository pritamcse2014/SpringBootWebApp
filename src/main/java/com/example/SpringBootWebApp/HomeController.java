package com.example.SpringBootWebApp;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String Home() {
    	System.out.println("Home");
        return "index.jsp";
    }

    @RequestMapping("add")
    public String Add(HttpServletRequest request) {
        System.out.println("Add");
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        int result = num1 + num2;
        System.out.println(result);
        return "result.jsp";
    }
}
