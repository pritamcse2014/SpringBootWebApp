package com.example.SpringBootWebApp;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String Home() {
    	System.out.println("Home");
        return "index.jsp";
    }

    @RequestMapping("add")
//    public String Add(@RequestParam("num1") int num, int num2, HttpSession session) {
    public String Add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, HttpSession session) {
        System.out.println("Add");
        int result = num1 + num2 + 1;
//        int result = num + num2 + 1;
        session.setAttribute("result", result);
        return "result.jsp";
    }
}
