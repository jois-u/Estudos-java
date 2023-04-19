public class exercicioFixacao {
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        // char se poe entre aspas simples
        //%s -  string, %d - int, %f - float, %2f - double, %b - boolean, %c - char
        System.out.println("Products: ");
        System.out.printf("%s, which price is $ %.2f\n", product1, price1);
        System.out.printf("%s, which price is $ %.2f", product2, price2);

        System.out.println();

        System.out.printf("Record: %d years old, code %d and gender: %c", age, code, gender);

        System.out.println();

        System.out.printf("Measure with eight decimal places: %.8f\n", measure);
        System.out.printf("Rounded (three decimal places): %.3f", measure);

    }
}
