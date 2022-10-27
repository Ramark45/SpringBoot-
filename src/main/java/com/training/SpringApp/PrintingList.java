package com.training.SpringApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class PrintingList {
    @GetMapping("/list")
    public ArrayList<String> studentlist(){
        ArrayList<String> mylist=new ArrayList<String>();
    mylist.add("Ramar");
    mylist.add("Raj");
    mylist.add("John");
    return mylist;
}
}
