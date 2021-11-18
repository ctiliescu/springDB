package com.mobile.academy.db.template;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TemplateController {
    @GetMapping("/index")
    public ModelAndView indexPage() {
        ModelAndView result = new ModelAndView("index");
        result.addObject("name", "TEST");
        return result;
    }
}
