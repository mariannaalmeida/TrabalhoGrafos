package src.lib;

import java.util.ArrayList;

public class Vertice<T> {
    private T valor;
    //Estratégia de Armazenamento - Lista de Adjacências
    private ArrayList<Aresta> destinos;

    public Vertice(T valor, ArrayList<Aresta> destinos) {
        this.valor = valor;
        this.destinos = destinos;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public ArrayList<Aresta> getDestinos() {
        return destinos;
    }

    public void setDestinos(ArrayList<Aresta> destinos) {
        this.destinos = destinos;
    }
}
