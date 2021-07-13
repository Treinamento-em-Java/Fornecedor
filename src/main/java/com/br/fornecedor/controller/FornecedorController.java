package com.br.fornecedor.controller;

import com.br.fornecedor.controller.dto.FornecedorDto;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "fornecedor", consumes="application/json")
public class FornecedorController {

    @PostMapping
    public String cadastrar(@RequestBody @Valid FornecedorDto fornecedor){
        System.out.println(fornecedor.getNome() + " cadastrado!");

        if(fornecedor.getCpf() == null ){
            return "Cpf nullo!";
        }if(fornecedor.getNome() == null){
            return "Nome nullo!";
        }

        return null;
    }

    @GetMapping
    public FornecedorDto getFornecedor(){
        FornecedorDto  fornecedor = new FornecedorDto("Ana", "1881");
        return fornecedor;
    }

}
