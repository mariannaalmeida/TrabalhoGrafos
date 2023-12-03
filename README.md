# TrabalhoGrafos

A biblioteca de grafos a ser desenvolvida deve ser capaz de representar e manipular grafos orientados.

## Implementação da representação de grafos: Listas de adjacência

Cada vértice do grafo deve armazenar um valor de tipo genérico. 

### Funcionalidades 

**A classe grafo deve prover métodos que permitam:**

+Incluir vértices no grafo;

+Incluir arestas no grafo;

+Verificar se há ciclos no grafo e retornar true, caso haja ciclo e false caso contrário. Uma forma clássica de se verificar ciclos em grafo é fazer uma pesquisa em profundidade (DFS), verificando se um vértice é visitado mais de uma vez;

+Fazer ordenação topológica do grafo. Uma ordenação topológica é uma ordenação linear de todos os vértices do grafo, tal que se o grafo contém uma aresta do vértice v1 para um vértice v2, v1 aparecerá antes de v2 na ordenação. Assim, só é possível gerar ordenação topológica em grafos orientados acíclicos.

