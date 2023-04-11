package com.geekster.SimpleApplication.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @GetMapping(value = "/student")
    public String getStudent(){
        return "This is get st";
    }
    @PutMapping(value = "/student")
    public String UpdateStudent(){
        return "This is put st";
    }
    @PostMapping(value = "/student")
    public String SaveStudent(){
        return "This is post st";
    }
    @DeleteMapping(value = "/student")
    public String DeleteStudent(){
        return "This is delete st";
    }

}
