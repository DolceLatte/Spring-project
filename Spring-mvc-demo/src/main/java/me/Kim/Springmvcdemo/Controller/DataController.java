package me.Kim.Springmvcdemo.Controller;

import me.Kim.Springmvcdemo.Domain.Data;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.server.ResponseStatusException;

@Controller
public class DataController {

    @GetMapping(value = "/get/{key}")
    @ResponseBody
    public String get(@PathVariable String key){
        return key;
    }

    @PostMapping("/post")
    @ResponseBody
    public int post(@RequestBody Data data){
        return data.getNumber();
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public ResponseEntity<String> delete(){
        return  new ResponseEntity<String>("SUCCESSMESSAGE!!", HttpStatus.OK);
    }


}
