package Matrizes;

import java.util.Random;
import Ordenacao.Ordenacao;

public class Matriz {
    private int[][] matriz;
    private int linha;
    private int coluna;

    public Matriz(int linha, int coluna){
        this.linha = linha;
        this.coluna = coluna;
        this.matriz = new int[linha][coluna];
    }

    public void preencherMatriz(){
        Random random = new Random();
        for (int a = 0; a < linha; a++){
            for (int l = 0; l < coluna; l++){
                this.matriz[a][l] = random.nextInt(100);
            }
        }
    }

    public void inserirElemento(int l, int c, int valor){
        if (l != 0){
            l--;
        }
        if (c != 0){
            c--;
        }
        if (l >= 0 && l < linha && c >= 0 && c < coluna){
            this.matriz[l][c] = valor;
        } else {
            System.out.println("Posição inválida!!!");
        }
    }

    public void removerElemento(int l, int c){
        if (l != 0){
            l--;
        }
        if (c != 0){
            c--;
        }
        if (l >= 0 && l < linha && c >= 0 && c < coluna){
            this.matriz[l][c] = 0;
        } else {
            System.out.println("Posição inválida!!!");
        }
    }

    public void exibirMatriz() {
        for (int i = 0; i < linha; i++) {
            System.out.print("| ");
            for (int j = 0; j < coluna; j++) {
                System.out.printf("%4d ", matriz[i][j]);
            }
            System.out.println("|");
        }
    }

    public int[][] getMatriz(){
        return matriz;
    }

    // Métodos de ordenação
    public void ordenarLinhas() {
        for (int i = 0; i < linha; i++) {
            Ordenacao.bubbleSort(matriz[i]);
        }
    }

    public void ordenarColunas() {
        for (int j = 0; j < coluna; j++) {
            int[] colArray = new int[linha];
            for (int i = 0; i < linha; i++) {
                colArray[i] = matriz[i][j];
            }
            Ordenacao.bubbleSort(colArray);
            for (int i = 0; i < linha; i++) {
                matriz[i][j] = colArray[i];
            }
        }
    }

    public void ordenarMatrizCompleta() {
        int[] flatArray = new int[linha * coluna];
        int index = 0;
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                flatArray[index++] = matriz[i][j];
            }
        }
        Ordenacao.mergeSort(flatArray, 0, flatArray.length - 1);
        index = 0;
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                matriz[i][j] = flatArray[index++];
            }
        }
    }
}
