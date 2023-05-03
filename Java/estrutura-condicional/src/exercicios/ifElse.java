package exercicios;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Questao 1");

        System.out.print("Digite um numero inteiro: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("POSITIVO");
        }
        // fim

        System.out.println("");
        System.out.println("Questao 2");

        System.out.print("Digite um numero inteiro: ");
        int num1 = sc.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
        //fim

        System.out.println("");
        System.out.println("Questao 3");

        int a, b;
        System.out.print("Digite um numero: ");
        a = sc.nextInt();
        System.out.print("Digite outro numero: ");
        b = sc.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("Sao multiplos.");
        } else {
            System.out.println("Nao sao multiplos");
        }
        //fim

        System.out.println("");
        System.out.println("Questao 4");

        System.out.print("Qual a hora inicial do jogo? ");
        int horaI = sc.nextInt();
        System.out.print("Qual a hora final do jogo? ");
        int horaF = sc.nextInt();

        int duracao;

        if (horaI < horaF) {
            duracao = horaF - horaI;
        } else {
            duracao = 24 - horaI + horaF;
        }
        System.out.println("O JOGO DUROU " + duracao + "HORA(S)");
        //fim


        System.out.println("");
        System.out.println("Questao 5");

        System.out.println("------------- Cardapio --------------");
        System.out.println("| CODIGO | " + " ESPECIFICACAO  | " + "PRECO  |");
        System.out.println("|    1   |" +  " Cachorro Quente | " + "R$4.00 |");
        System.out.println("|    2   |" +  " X-Salada        | " + "R$4.50 |");
        System.out.println("|    3   |" +  " X-Bacon         | " + "R$5.00 |");
        System.out.println("|    4   |" +  " Torrada simples | " + "R$2.00 |");
        System.out.println("|    5   |" +  " Refrigerante    | " + "R$1.50 |");
        System.out.println("-------------------------------------");

        System.out.println("Para fazer o pedido, digite o codigo do produto e a quantidade: ");
        int codP = sc.nextInt();
        int qnt = sc.nextInt();

        double total = 0;
        if(codP == 1) {
            total = qnt * 4.0;
        }
        else if(codP == 2) {
            total = qnt * 4.5;
        }
        else if (codP == 3) {
            total = qnt * 5.0;
        }
        else if (codP == 4) {
            total = qnt * 2.0;
        }
        else if (codP == 5) {
            total = qnt * 1.5;
        }
        else {
            System.out.println("Produto nao encontrado");
        }
        
        System.out.printf("Total: R$%.2f", total);
        //fim

        System.out.println("");
        System.out.println("Questao 6");

        System.out.println("Digite um numero: ");
        double numero = sc.nextDouble();

        if (numero < 0.0 || numero > 100.0) {
            System.out.println("Fora do intervalo.");
        }
        else if (numero <= 25.0) {
            System.out.println("Intervalo [0, 25]");
        }
        else if (numero <= 50.0) {
            System.out.println("Intervalo [25, 50]");
        }
        else if (numero <= 75.0) {
            System.out.println("Intervalo [50, 75]");
        }
        else {
            System.out.println("Intervalo [75, 100]");
        }
        //fim


        sc.close();
    }
}
