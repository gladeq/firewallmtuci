package src.main.controller;

import org.springframework.web.bind.annotation.*;
import ru.mtuci.demo.model.Demo;

@RestController
@RequestMapping("/")

public class DemoController {
    //("/") + ("/hello")
    @GetMapping("/hello")
    public String getHello(@RequestParam String str) {
        return str;
    }
    public Demo setValue(@RequestBody Demo demo) {
        demo.setNumber(demo.getNumber() + 1);
        return demo;
    }
}
