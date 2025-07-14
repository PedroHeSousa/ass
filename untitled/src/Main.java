import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tamanho = 45;
        int largura = 12;
        int resultadoSoma;
        int novoNumero;
        int resultadoFinal;

        resultadoSoma = tamanho + largura;

        System.out.println("insira um numero para adicionar a soma ");

        novoNumero = sc.nextInt();

        resultadoFinal = novoNumero + resultadoSoma;

        System.out.println("resultado soma = " + resultadoFinal);

        sc.close();

    }
}




