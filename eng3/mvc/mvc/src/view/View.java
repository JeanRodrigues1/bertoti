package view;

import java.util.List;

import model.Lanche;

import controller.Bebida;

public class View implements Observer{

    private Bebida bebida;
    private List<Lanche> listaLanches;

    public void setBebida(Bebida bebida){
        bebida = bebida;
    }

    public void update(List<Lanche> lanches){
        listaLanches = lanches;
        this.bebida.escolherBebida();

    }

    public void combo(String nome){
        if(!listaLanches.isEmpty()){
            for(Lanche i: listaLanches){
                if(nome == i.getNome()){
                    System.out.println("nome lanche:" + i.getNome()+" preço lanche: "+i.getPreco());
                }
            }
        }
    }
}