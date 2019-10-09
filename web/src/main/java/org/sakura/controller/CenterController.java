package org.sakura.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class CenterController {
    @GetMapping(path = "test")
    public String test(){
        return "this is a test";
    }
}
