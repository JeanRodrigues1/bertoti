package model;

public class Lanche {

    private String nome;
    private double preco;

    public Lanche(String nome, double preco){
        nome = nome;
        preco = preco;
    }

    public String getNome(){
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public boolean matches(Lanche lanche){
        if(!nome.equals(lanche.nome)) return false;
        return true;
    }
}