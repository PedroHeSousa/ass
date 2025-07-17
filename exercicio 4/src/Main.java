import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int funcionario;
        double horas;
        double valorH;
        int numero;
        double salario;

        System.out.println("Digite o numero do funcionario");

        funcionario = sc.nextInt();

        System.out.println("Digite as horas trabalhadas %.2f%n");

        horas = sc.nextDouble();

        System.out.println("Digite o valor das horas");

        valorH = sc.nextDouble();

        System.out.println("Numero do funcionario = " + funcionario);

        salario = horas * valorH;

        System.out.printf("Salario = R$ %.2f%n" , salario);

    sc.close();

    }
}