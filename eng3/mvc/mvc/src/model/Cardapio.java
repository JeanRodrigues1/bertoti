package model;
import java.util.List;
import java.util.LinkedList;

import view.Observer;

public class Cardapio implements Subject{

    private List lanches;
    private List observers;

    public Cardapio(){
        lanches = new LinkedList();
        observers = new LinkedList();
    }



    public void registerObserver(Observer observer){
        observers.add(observer);
    }


    public void notifyObservers(List encontrados){
        for(Object i: observers){
            Observer observer = (Observer)i;
            observer.update(encontrados);
        }
    }

    public void addLanche(Lanche lanche){
        lanches.add(lanche);
    }

    public void buscarLanche(Lanche lanche){
        List encontrados = new LinkedList();
        for(Object i: lanches){
            Lanche lancheCardapio = (Lanche)i;
            if(lancheCardapio.matches(lanche)) encontrados.add(lancheCardapio);
        }
        notifyObservers(encontrados);
    }

}