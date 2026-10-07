package com.pe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/say")
public class SaludoController {
    @GetMapping("/saludo")
    public String Saludo(@RequestParam String name){
        return "Bienvenido a la cadena de Restaurante: Estimado(a): " + name;
    }
}