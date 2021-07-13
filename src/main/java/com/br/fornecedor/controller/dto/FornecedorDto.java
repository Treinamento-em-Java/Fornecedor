package com.br.fornecedor.controller.dto;

import org.springframework.lang.NonNull;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class FornecedorDto {


    private String nome;
    private String cpf;


    public FornecedorDto(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public FornecedorDto(){
    }


    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }




}
