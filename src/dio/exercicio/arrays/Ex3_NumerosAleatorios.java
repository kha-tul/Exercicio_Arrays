package dio.exercicio.arrays;
/*
Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
 */

import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        //1º usar classe random para criar números aleatorios:
        Random random = new Random();

        //2º criar array para armazenar numeros aleatorios:
        int[] numerosAleatorios = new int[20]; //posicao [20] dentro do array

        //3º criar laco para colocar esses 20 valores dentro do array em numeros aleatorios:
        for (int i = 0; i < numerosAleatorios.length; i++) {
            //comeca a contagem no zero. numeros aleatorios.

            //4º criar variavel numero para armazenar os numeros que a classe Random gerar
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero; //criar para dizer que numerosAleatorios, na posicao i, vai receber
            //numero geraro com o random.
            //o laco continuará em execucao até i < numerosAleatorios.
        }

        //5º o exercicio pede para imprimir nmeros gerados e seus sucessores. Usa o laco foreach:

        System.out.print("Numeros aleatorios: ");

        for (int numero : numerosAleatorios) { //cria a variavel numero para numerosAleatorios.
            System.out.print(numero + " ");
        }

        //6º imprimir sucessor de cada elemento:
        System.out.print("\nSucessores dos Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero+1) + " "); //como são sucessores, é necessário somar a variável número
            //+1 numero. então (numero+1)
        }

        //7º caso a questão pedisse numeros antecessores:
        System.out.print("\nAntecessores dos Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero-1) + " "); //como são antecessores, é necessário somar a variável número
            //-1 numero. então (numero+1)
        }

    }
}
