package exercicios;

import java.util.Scanner;

public class exercicioFix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Questao 1
        System.out.println("Exercicio 1");
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("SOMA: " + (a + b));
        //fim

        //Questao 2
        System.out.println("Exercicio 2");
        int A, B, C, D;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        int dif = (A * B - C * D);

        System.out.println("DIFERENCA: " + dif);
        //fim

        //Questao 3
        System.out.println("Exercicio 3");
        int numberFunc;
        double trabH, valorH;

        System.out.println("Numero do funcionario: ");
        numberFunc = sc.nextInt();
        System.out.println("Horas trabalhadas: ");
        trabH = sc.nextDouble();
        System.out.println("Valor por hora: ");
        valorH = sc.nextDouble();

        System.out.println("NUMBER: " + numberFunc);
        System.out.printf("SALARY = U$%.2f ", (trabH * valorH));
        //fim

        //Questao 4
        System.out.println("Exercicio 4");
        int p1, n1, p2, n2;
        double v1, v2;

        System.out.println("Codigo da peca 1: ");
        p1 = sc.nextInt();
        System.out.println("Numero de pecas 1: ");
        n1 = sc.nextInt();
        System.out.println("Valor unitario da peca 1");
        v1 = sc.nextDouble();
        System.out.println("Codigo da peca 2: ");
        p2 = sc.nextInt();
        System.out.println("Numero de pecas 2: ");
        n2 = sc.nextInt();
        System.out.println("Valor unitario da peca 2");
        v2 = sc.nextDouble();

        double peca1 = n1  * v1;
        double peca2 = n2 * v2;
        double total = peca1 + peca2;

        System.out.printf("VALOR A PAGAR: R$%.2f ", total);
        //fim

        sc.close();
    }
}
