package com.geekster.SimpleApplication.controller;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatController {
    @GetMapping(value = "/cat")
    public String getCatInfo(){
        return "This is the information about cat";
    }

    @PostMapping(value = "/cat")
    public String saveCat(@RequestBody String requestData){
        JSONObject jsonobj = new JSONObject(requestData);
        String name = jsonobj.getString("name");
        String username = jsonobj.getString("username");
        int age = jsonobj.getInt("age");
        System.out.println(name+" "+age+" "+" "+username);
        return "Saved- " + requestData;
    }
}
