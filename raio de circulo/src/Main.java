import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double raio;
        double pi = 3.14159;
        double area;

        System.out.println("qual o raio");

        raio = sc.nextDouble();

        area = pi * (raio * raio);

        System.out.printf("resultado = %.4f%n" , area);

        sc.close();

    }
}