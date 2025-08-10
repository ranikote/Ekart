package com.reljicd.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomErrorController implements ErrorController {

    @GetMapping("/error")
    public ModelAndView handleError() {
        return new ModelAndView("error"); // returns error.html or error.jsp
    }

    @GetMapping("/403")
    public ModelAndView handle403() {
        return new ModelAndView("403"); // returns 403.html or 403.jsp
    }
}

