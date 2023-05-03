import java.util.Scanner;

public class horarioDia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hora;
        System.out.print("What time is it? ");
        hora = sc.nextInt();

        if (hora < 12) {
            System.out.println("Good Morning!");
        } else if (hora < 18) {
            System.out.println("Good Afternoon!");
        } else {
            System.out.println("Good Night!");
        }

        sc.close();
    }
}
