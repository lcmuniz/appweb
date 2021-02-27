package com.acme.appweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaudacaoController {

    @GetMapping("/ola")
    public String ola() {
        return "Olá caro aluno";
    }

    @PostMapping("/ola")
    public String olaPessoa(@RequestBody String nome) {
        return "Olá, " + nome;
    }


    @GetMapping("/saudacao")
    public String saudacao() {
        return "Bom dia";
    }

    @GetMapping("/saudacao/maria")
    public String maria() {
        return "Bom dia Maria";
    }



}
