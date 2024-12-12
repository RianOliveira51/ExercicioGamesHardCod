package com.example.exerciciocompragame.entities;

import org.yaml.snakeyaml.events.Event;

public class Carrinho extends Game {

    private int IDCarrinho = 1;

    public Carrinho(int codigo, String nome, int Armazem, int quant, double price) {
        super(codigo, nome, Armazem, quant, price);
    }


    public int getIDCarrinho(){
        return IDCarrinho;
    }
    @Override
    public double total() {
        double total;
        return total = getQuant() * getPrice();
    }

    @Override
    public String toString(){
        return "ID do carrinho: " + IDCarrinho
                + ", ID do jogo: " + getCodigo()
                + ", Nome: " + getNome()
                + ", Valor: " + getPrice();
    }
}
