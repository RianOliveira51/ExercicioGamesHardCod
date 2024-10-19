package com.example.exerciciocompragame.entities;

public class Armazem {

    private Integer ID;
    private Integer quant;

    public Armazem(Integer ID, Integer quant){
        this.ID = ID;
        this.quant = quant;
    }

    public Integer getId(){
        return ID;
    }

    public Integer getQuant(){
        return quant;
    }

    public void setQuant(Integer quant){
        this.quant = quant;
    }
    @Override
    public String toString(){
        return "Armazem: " + ID + ", Quantidade: " + quant;
    }

}
