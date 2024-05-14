package controller;
import model.Cardapio;
import view.View;

public class Suco implements Bebida{

    private View view;
    private Cardapio cardapio;

    public void setView(View view){
        view = view;
    }

    public void escolherBebida(String nome){
        view.combo(nome);
    }

}