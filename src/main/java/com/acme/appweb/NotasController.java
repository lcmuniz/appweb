package com.acme.appweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NotasController {

    @GetMapping("/notas")
    public String[] listar() {
        String[] notas = new String[]{"Nota 1","Nota 2"};
        return notas;
    }


}
