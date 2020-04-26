package com.curso.demo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {

    @Value("${index.saludo}")
    private String saludo;


    @GetMapping("/")
    public String inicio (Model model) {

        String mensaje = "Hola mundo con Spring";


        model.addAttribute("mensaje" ,mensaje);
        model.addAttribute("saludo", saludo);

        return "index";
    }
}
