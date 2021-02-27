package com.acme.appweb;

import org.springframework.web.bind.annotation.*;

@RestController
public class TesteController {

    @PutMapping("/atualizar")
    public void atualizar(@RequestBody String nome) {
        System.out.println(nome);
    }

    @DeleteMapping("/excluir/{id}")
    public String excluir(@PathVariable("id") String id) {
        return "Excluindo registro " + id;
    }

    @PutMapping("/atualizar/{codigo}")
    public String atualizarPessoa(@PathVariable("codigo") String codigo, @RequestBody String nome) {
        return "Atualizando o código " + codigo + " com o nome " + nome;
    }

}
