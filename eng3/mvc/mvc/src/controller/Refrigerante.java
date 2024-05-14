package controller;

import model.Cardapio;
import view.View;

public class Refrigerante implements Bebida{

    private View view;
    private Cardapio cardapio;

    public void setView(View view){
        view = view;
    }

    public void escolherBebida(String nome){
        view.combo(nome);
    }

}