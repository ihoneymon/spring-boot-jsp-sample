package io.honeymon.springboot.jspsample.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RootController {

    @RequestMapping("/")
    public String helloWorld() {
        return "hello";
    }
    
    @RequestMapping("/2nd")
    public String secondSubPage() {
        return "test/list";
    }
}
