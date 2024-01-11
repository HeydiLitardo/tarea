package com.example.tarea;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ElectrodomesticosController {

    @Value("${spring.application.name}")
    String appName;

    List<Map<String,String>> electrodomesticos = 
        List.of(
            Map.of("id", "1", "modelName", "Samsung"),
            Map.of("id", "2", "modelName", "LG"),
            Map.of("id", "3", "modelName", "Sony"),
            Map.of("id", "4", "modelName", "Panasonic"),
            Map.of("id", "5", "modelName", "Toshiba"),
            Map.of("id", "6", "modelName", "Philips"),
            Map.of("id", "7", "modelName", "Hisense"),
            Map.of("id", "8", "modelName", "Sharp"),
            Map.of("id", "9", "modelName", "Hitachi"),
            Map.of("id", "10", "modelName", "JVC"),
            Map.of("id", "11", "modelName", "Sanyo"),
            Map.of("id", "12", "modelName", "Daewoo"),
            Map.of("id", "13", "modelName", "AOC"),
            Map.of("id", "14", "modelName", "Pioneer"),
            Map.of("id", "15", "modelName", "Vizio")
        );

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        model.addAttribute("electrodomesticos", electrodomesticos);
        return "index";
    }
}
