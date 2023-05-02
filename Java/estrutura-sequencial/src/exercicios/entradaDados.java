package exercicios;

import java.util.Scanner;

public class entradaDados {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um nome: ");
        String x = sc.next();
        System.out.println("Voce digitou: " + x);


        System.out.print("Digite um numero inteiro: ");
        int y = sc.nextInt(); // ou int y; y = sc.nextInt();
        System.out.println("Voce digitou: " + y);

        System.out.print("Digite um numero real: ");
        double z = sc.nextDouble(); // ou double z; z = sc.nextDouble();
        System.out.println("Voce digitou: " + z);

        System.out.print("Digite um caracter: ");
        char j = sc.next().charAt(0);  // ou char j; j = sc.next().charAt();
        System.out.println("Voce digitou: " + j);

        //Ler varios dados na mesma linha
        String a;
        int b;
        double c;

        System.out.print("Digite seu nome, sua idade e sua altura: ");
        a = sc.next();
        b = sc.nextInt();
        c = sc.nextDouble();
        System.out.printf("Your name is %s, your age is %d and you height is %.2f", a, b, c);



       sc.close();
    }
}
