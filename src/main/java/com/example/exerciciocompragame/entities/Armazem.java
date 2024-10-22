package com.example.exerciciocompragame.entities;

public class Armazem {

    private Integer armazem;
    private Integer quant;

    public Armazem(Integer armazem, Integer quant){
        this.armazem = armazem;
        this.quant = quant;
    }

    public Integer getId(){
        return armazem;
    }

    public Integer getQuant(){
        return quant;
    }

    public void setQuant(Integer quant){
        this.quant = quant;
    }
    @Override
    public String toString(){
        return "Armazem: " + armazem + ", Quantidade: " + quant;
    }

}
