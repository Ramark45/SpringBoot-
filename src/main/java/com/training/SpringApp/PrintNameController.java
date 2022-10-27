package com.training.SpringApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrintNameController {
    @GetMapping("/ram")
    public String myname(){
        return "I'm Ramar Kalangiam";
    }
    @GetMapping("/student")
    public Student student()
    {
        return new Student("Ramar","Kalangiam");
    }
    @GetMapping("/student/{firstName}/{lastName}")
    public Student student_two(@PathVariable("firstName") String fname,@PathVariable("lastName") String lname)
    {
        return new Student(fname,lname);
    }
    @GetMapping("/student/api")
    public Student student_three(@RequestParam(name="firstName") String fname, @RequestParam(name="lastName") String lname)
    {
        return new Student(fname,lname);
    }



}
