package dio.exercicio.arrays;
/*
   Crie um vetor de 6 números inteiros
   e mostre-os na ordem inversa
 */

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        //1º declarar os elementos que estarão contidos dentro do array. em arrays, os elementos precisam ser
        //do mesmo tipo
        int[] vetor = {-6, -5, 15, 50, 8, 4}; //o [] indica que é um array
        //numeros informados são aleatorios
        //arrays comecam sempre com zero, a primeira posicao é zero
        //a ordem que é inserido no array, é a ordem de impressão.

        //2º imprimir array
        // System.out.println(vetor); //assim dá erro - é exibida a memória. para mostrar o array é necessário
        //criar um laço de repetição

        System.out.print("Vetor: "); //ver 4º passo

        //3º criar variavel para controlar o contador da repeticao do laco
        int count = 0;
        while (count < (vetor.length)){
            System.out.println(vetor[count] + " "); //imprimir vetor. ele comecara na posicao zero por conta do count
            count++; //quando o laco virar, isso é repetir, somará mais 1!
        }
        // 4º criar um sout antes do laco de repeticao para imprimir a palavra vetor

        //5º conforme solicitado no exercicio, agora precisamos organizar o vetor pela ordem inversa. Criamos
        //então outro laco de repeticao para executar na ordem inversa:

        System.out.println("\n Vetor: ");

        for (int i = (vetor.length-1); i >= 0; i--) {//é necessário colocar o -1 pois, caso contrário, o laço, que executará a
            //repeticao na ordem inversa, começar na posição 6, que não existe nesse vetor que possuí 6 elementos.
            //as posições são 5, mas o tamanho é 6.
           // i >= 0 pois o laco deverá ser executado até chegar a zero.
           // e i-- porque o exercicio solicitou decrescente.

            //6º pedimos para imprimir o vetor
            System.out.print(vetor[i] + " ");
        }

    }

}
