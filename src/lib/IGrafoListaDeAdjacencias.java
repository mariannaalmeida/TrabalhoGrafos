package src.lib;

public interface IGrafoListaDeAdjacencias<T> {


    /**
     * Método para adicionar um vértice em uma lista de vértices.
     * @param valor - Elemento do Tipo T a ser armazenado na lista de vértices.
     *
     */
    public Vertice<T> adicionarVertice(T valor);

    /**
     * Método para obter um vértice em uma lista de vértices.
     *
     * @param valor - Elemento do Tipo T a ser buscado na lista de vértices.
     */

    private  Vertice obterVertice(T valor) {
        return null;
    }

    /**
     * Método para adicionar uma aresta em uma lista de vértices.
     *  origem , destino  e peso   e- Elementos do Tipo T a ser armazenado na lista de vértices origem, destino e peso .
     *
     */

    public void adicionarAresta(T oriegm, T destino, float peso);


}
