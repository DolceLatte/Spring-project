package me.Kim.Springmvcdemo.Controller;

import me.Kim.Springmvcdemo.Domain.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class DataController {

    @GetMapping("/get/{key}")
    @ResponseBody //응답본문에 전송
    public String get(@PathVariable(required = false) String key) {
        return key;
    }
    @GetMapping("/get2")
    @ResponseBody //응답본문에 전송
    public String get2(@RequestParam("key") String key,@RequestParam("val") String val) {
        return key+val;
    }

    @PostMapping(value = "/post",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public Data post(@RequestBody Data data) {
        return data;
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public ResponseEntity<String> delete() {
        return new ResponseEntity<String>("SUCCESSMESSAGE!!", HttpStatus.OK);
    }

    @GetMapping("/view")
    public String view() {
        //view를 찾아가는 핸들러
        return "view";
    }

}
