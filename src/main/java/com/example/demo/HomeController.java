package com.example.demo;
@Controller
public class HomeController {
    @RequestMapping("/")
    public String homepage(){
        return "index";
    }
}
