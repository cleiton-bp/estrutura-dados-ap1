# Manipulação de Matrizes e Ordenação

Este é nosso trabalho de AP1 que implementa uma classe `Matriz` para manipulação de matrizes bidimensionais de inteiros e uma classe `Ordenacao` para realizar a ordenação dos elementos da matriz. A seguir, estão as funcionalidades implementadas, a explicação de como o trabalho foi montado e um exemplo de uso.

## Tarefas

### Manipulação de Matrizes

A classe `Matriz` permite armazenar uma matriz bidimensional de inteiros com dimensões definidas pelo usuário. Foram implementados os seguintes métodos:

- **Preenchimento da matriz**: Preenchimento com valores aleatórios.
- **Inserção de elementos**: Inserção de elementos em posições específicas.
- **Remoção de elementos**: Remoção de elementos por posição.
- **Exibição da matriz**: Exibição da matriz no console.
- **Retorno da matriz**: Retorna a matriz bidimensional.

### Ordenação

Foram implementados dois algoritmos de ordenação, sendo um deles recursivo:

- **Bubble Sort**: Algoritmo iterativo.
- **Merge Sort**: Algoritmo recursivo.

Os algoritmos podem ser aplicados às linhas, colunas e à matriz completa. O usuário pode escolher entre:

- **Ordenar elementos por linhas.**
- **Ordenar elementos por colunas.**
- **Ordenar a matriz completa.**

## Exemplo de Aplicação

### Matriz de Entrada

```plaintext
  [ 5, 35, 64, 26]
  [12, 24, 27, 29]
  [48, 86, 87, 91]
  [ 1, 32, 43, 55]
```
### Ordenada por Linha

```plaintext
  [ 5, 26, 35, 64]
  [12, 24, 27, 29]
  [48, 86, 87, 91]
  [ 1, 32, 43, 55] 
```
### Ordenada por Coluna

```plaintext
  [ 1, 24, 26, 27]
  [ 5, 35, 29, 55] 
  [12, 43, 32, 64] 
  [87, 86, 48, 91]
```
### Ordenada como Vetor

```plaintext
  [ 1,  5, 12, 24] 
  [26, 27, 29, 32] 
  [35, 43, 48, 55]
  [64, 86, 87, 91]
```

## Curiosidades sobre Algoritmos de Ordenação

### Bubble Sort

**Quando usar:**

- Ideal para conjuntos de dados pequenos devido à sua simplicidade.
- Útil quando a lista está quase ordenada, pois pode detectar a ordenação e parar mais cedo.

**Desvantagens:**

- Ineficiente para grandes conjuntos de dados devido à sua complexidade de tempo.
- Realiza muitas trocas, o que pode ser custoso em termos de desempenho.

### Merge Sort

**Quando usar:**

- Adequado para grandes conjuntos de dados devido à sua complexidade de tempo.
- Funciona bem com listas ligadas e estruturas de dados que permitem acesso sequencial.

**Desvantagens:**

- Pode ser mais complexo de implementar em comparação com algoritmos iterativos como o Bubble Sort.
