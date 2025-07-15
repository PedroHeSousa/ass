import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     int A;
     int B;
     int C;
     int D;
     int diferenca;


     System.out.println("Descreva os numeros");

     A = sc.nextInt();
     B = sc.nextInt();
     C = sc.nextInt();
     D = sc.nextInt();

     diferenca = A * B - C * D;

     System.out.println("RESULTADO " + diferenca);

     sc.close();





    }
}