import Matrizes.Matriz;

public class Main {
    public static void main(String[] args)
    {
        Matriz matriz = new Matriz(4, 4);

        // Preenchendo a matriz com valores aleatórios
        matriz.preencherMatriz();
        System.out.println("Matriz Original:");
        matriz.exibirMatriz();

        // Inserindo um elemento
        int num1 = 2;
        int num2 = 3;
        matriz.inserirElemento(num1, num2, 99);
        System.out.println("\nMatriz após inserção do elemento 99 na posição (" + num1 + " , " + num2 + "):");
        matriz.exibirMatriz();

        // Removendo um elemento
        num1 = 1;
        num2 = 2;
        matriz.removerElemento(num1, num2);
        System.out.println("\nMatriz após remover do elemento na posição (" + num1 + " , " + num2 + "):");
        matriz.exibirMatriz();

        // Ordenando linhas
        System.out.println("\nOrdenando Linhas:");
        matriz.ordenarLinhas();
        matriz.exibirMatriz();

        // Ordenando colunas
        System.out.println("\nOrdenando Colunas:");
        matriz.ordenarColunas();
        matriz.exibirMatriz();

        // Ordenando matriz completa
        System.out.println("\nOrdenando Matriz Completa:");
        matriz.ordenarMatrizCompleta();
        matriz.exibirMatriz();
    }
}
