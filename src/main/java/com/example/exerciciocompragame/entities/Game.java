package com.example.exerciciocompragame.entities;

import static java.lang.String.format;

public class Game extends Armazem implements GameIf {

    private int codigo;
    private String nome;
    private double price;

    public Game(int codigo, String nome, int Armazem, int quant,double price) {
        super(Armazem, quant);
        this.codigo = codigo;
        this.nome = nome;
        this.price = price;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getNome(){
        return nome;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(){
        this.price = price;
    }

    @Override
    public double total() {
        double total;
        return total = getQuant() * price;
    }

    public void retirada(){
        setQuant(getQuant() - 1);
    }

    @Override
    public String toString(){
        return "ID: " + codigo +
                ", Nome: " + nome +
                ", Quantidade Disponivel: " + getQuant() +
                ", Price: " + price;


    }
}
