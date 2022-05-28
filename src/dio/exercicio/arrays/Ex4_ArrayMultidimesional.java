package dio.exercicio.arrays;
/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9
 */

import java.util.Random;

public class Ex4_ArrayMultidimesional {
    public static void main(String[] args) {
        //1º gerar numeros aleatorios com a classe Random
        Random random = new Random();

        //2º conforme solicitado no problema, criar uma matriz. Para isso, criarmos um array, com um abertura de
        //[] para linha e outra [] para coluna
        int[][] M = new int[4][4]; //conforme exercicio solicita, são 4 linhas e 4 colunas.
        //cada linha reprenta um array, cada coluna representa os elementos desse array

        //3º como preencher essas linhas e colunas? criar um for, para navegar dentro da matriz geral
        for(int i = 0; i < M.length; i++) {
            //i = 0- é a primeira linha da matriz. i tem que ser menor que o tamanho da matriz.
            // percorrer com i++ incrementa. Nesse 1º for, é uma linha. Para percorrer todos os elementos
            // dessa linha, é necessário criar outro for:
            for (int j = 0; j < M[i].length; j++) {
                //j representa cada coluna da linha i, do primeiro for.

                //4º após isso, vvamos querer pegar toda matriz, e colocar um número aleatorio com a variável random:
                M[i][j] = random.nextInt(9); //aqui, determinamos que é até 9, conforme solicitado no exercicio.
            }
        } //5º é necessário mostrar todos os elementos dentro dessa matriz, usando foreach:
        for (int[] linha : M ) { //primeiro, será percorrido a matriz geral. depois, pegaremos cada elemento dentro dessa matriz
            //cada linha da matriz, contém um array. Criamos int[] linha e percorremos M.

            //6º pegaremos cada elemento dentro dessa linha com outro forach:
            for (int elementoDaColuna : linha) { //cada elemento dentro da linha é um inteiro. então, int. A coluna estará dentro
                //da linha.

                //7º imprimir cada elemento:
                System.out.print(elementoDaColuna + " ");

            }
            //8º pedir para pular linha:
            System.out.println();

        }

    }
}
