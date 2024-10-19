package com.example.exerciciocompragame.entities;

public class Comprador {
    private String nome;
    private String CPF;

    public Comprador(String nome, String CPF){
        this.nome = nome;
        this.CPF = CPF;
    }

    public String getName(){
        return nome;
    }

    public void setName(String name){
        this.nome = name;
    }

    public String getCPF(){
        return CPF;
    }

    public void setCPF(String CPF){
        this.CPF = CPF;
    }

    public String toString(){
        return "Nome: " + nome + ", CPF: " + CPF;
    }

}
