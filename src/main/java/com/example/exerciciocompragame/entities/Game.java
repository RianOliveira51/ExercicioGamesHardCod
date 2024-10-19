package com.example.exerciciocompragame.entities;

public class Game extends Armazem implements Games {

    private Integer codigo;
    private String nome;

    private double price;

    public Game(Integer codigo, String nome, Integer ID, Integer quant,double price) {
        super(ID, quant);
        this.codigo = codigo;
        this.nome = nome;
        this.price = price;
    }

    public Integer getCodigo(){
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
    public double total(Integer quant, double price) {
        return 0;
    }

    @Override
    public String toString(){
        return "ID: " + codigo +
                ", Nome: " + nome +
                ", Price: " + String.format("%.2f", price);
    }
}
