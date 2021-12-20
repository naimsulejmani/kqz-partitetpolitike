package ict.kqz.kqzpartitetpolitike.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
//http://localhost:9090/
public class HomeController {

    @GetMapping(value = "")
    public String getIndex() {
        return "index";
    }

}
