package me.Kim.Springmvcdemo.Controller;

import jdk.nashorn.internal.parser.JSONParser;
import me.Kim.Springmvcdemo.Domain.Data;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class DataController {

    @GetMapping(value = "/get/{key}")
    @ResponseBody
    public String get(@PathVariable String key){
        return key;
    }

    @PostMapping(value = "/post",
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public Data post(Data data){
        System.out.println(data);
        return data;
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public void delete(){
        return;
    }


}
