package me.Kim.Springmvcdemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DataController {

    @GetMapping("/get")
    public String get(){
        return "Get";
    }
}
