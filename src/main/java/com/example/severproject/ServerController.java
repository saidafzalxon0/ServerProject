package com.example.severproject;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/enter")
public class ServerController {

    @GetMapping
    public HashMap<String,String> convertMap(){
        HashMap<String,String> map = new HashMap<>();
        map.put("1","BIR");
        map.put("2","IKKI");
        map.put("3","UCH");
        return map;
    }
}
