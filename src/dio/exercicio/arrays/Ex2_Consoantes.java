package dio.exercicio.arrays;

import java.util.Scanner;

/*
Faça um programa que leia 6 caracteres,
diga quantas consoantes foram lidas e
imprima as consoantes.

 */
public class Ex2_Consoantes {
    public static void main(String[] args) {
        //1º se o exercicio pede para ler, criamos uma solicitacao de digitacao com a classe scan
        Scanner scan = new Scanner(System.in);

        //2º crie um array para guardar o que foi informado via Scanner.
        //[] é array!
        String[] consoantes = new String[6];

        //3º no exercicio é solicitado mostrar quantas consoantes foram lidas. É necessário criar uma variável
        //para mostrar quantas foram exibidas:
        int quantidadeConsoantes = 0;

        //4º criar um laço de repeticao para mostrar dentro do array
        //5º criar contador para controlar repeticoes do laco:
        int count = 0;
        do {
            //6º pedir para o usuário digitar e criar uma variável para armazenar
            System.out.println("Letra: ");
            String letra = scan.next();

            //7º criar uma logica para distinguir consoantes e vogais (solicitado no exercicio)
            //cria o if, especificando com metodo equalsIgnoreCase, linkando com a variável letra
            // (criado via objeto String)
            // é inserido o '!' antes do parenteses para dizer que, quando NÃO for igual, deverá pegar o array
            //
            if ( !(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")) ) { //abre colchetes
                consoantes[count] = letra; //pega o array de 'consoantes',abre [], na posicao que estiver o laco
                //que é a posicao zero (count), irá somar com a quantidade de consoantes letra.
                quantidadeConsoantes++;
            }
            count++; //implementa contador +1;

        } while (count < consoantes.length); //o laco ira se repetir até o contador ser menor do que consoantes (criado acima
        //via array String, que tem 6. quando chegar a 6, o laco irá parar

        //8º exercicio pede que imprima quantas consoantes foram lidas. É criado um laco de repeticao para isso:
        for ( String consoante : consoantes) { //foreach - lado esquerdo tipo de array; direito, o array.
            //lado esquerdo - a variável 'String consoante' foi criada agora.
            //lado direito - array consoantes para navegar

            //10º se imprimirmos o passo 9º, as vogais aparecerão como 'null' no console. Para resolver isso,
            //criamos um if:
            if (consoante != null) //se a consoante for diferente (!=) de null, será impresso o sout abaixo.
                //ou seja, as vogais não são impressas.

            //9º a cada loop executado, é necessário ler a consoante:
            System.out.println(consoante + " ");
            //ou seja, foreach : para cada elemento ('consoante') no array ('consoantes') quero que
            // imprima 'consoante'
        }
        //11º o exercicio pede a quantidade de consoantes, então:
        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
        System.out.println(consoantes.length); //quantidade de elementos
    }
}
