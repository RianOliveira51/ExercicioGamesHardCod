package com.example.exerciciocompragame.entities;

import org.yaml.snakeyaml.events.Event;

public class Carrinho extends Game {

    private Integer IDCarrinho = 1;

    public Carrinho(Integer codigo, String nome, Integer Armazem, Integer quant, double price) {
        super(codigo, nome, Armazem, quant, price);
    }

    public Integer getIDCarrinho(){
        return IDCarrinho;
    }

    @Override
    public String toString(){
        return "ID do carrinho: " + getIDCarrinho();
    }
}
