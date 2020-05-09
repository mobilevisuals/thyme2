package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {

    @GetMapping("/addUser")
    public String sendForm(User user) {
        //metoden svarar på getrequest till /addUser och skickar tillbaka addUser.htm sidan
        return "addUser";
    }

    @PostMapping("/addUser")
    public String processForm(User user) {
        //metoden hanterar POST från ett formulär på /adduser
        //och returnerar sidan showMessage.htm
        //där det som skickas med POST visas
        return "showMessage";
    }
}
