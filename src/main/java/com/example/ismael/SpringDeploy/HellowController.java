package com.example.ismael.SpringDeploy;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowController {


  //  @Value("${app.varexample}")
    @Value("${app.message}")
    String message;



    @GetMapping("/hola")
    public String holaMundo(){

        System.out.println(message);
        return "Ricura pegate una duchita " + " " +
                " que te voy a poner en pompeta   ; ) ";
    }

}
