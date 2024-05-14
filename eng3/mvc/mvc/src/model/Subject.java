package model;

import java.util.List;

import view.Observer;

public interface Subject {

    public void registerObserver(Observer observer);
    public void notifyObservers(List encontrados);

}