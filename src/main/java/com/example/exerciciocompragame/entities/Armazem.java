package com.example.exerciciocompragame.entities;

public class Armazem {

    private int armazem;
    private int quant;

    public Armazem(int armazem, int quant){
        this.armazem = armazem;
        this.quant = quant;
    }

    public int getArmazem(){
        return armazem;
    }

    public int getQuant(){
        return quant;
    }

    public void setQuant(int quant){
        this.quant = quant;
    }

    public void retirada(int quant){
        this.quant = quant - 1;
    }

    @Override
    public String toString(){
        return "Armazem: " + armazem + ", Quantidade: " + quant;
    }

}
