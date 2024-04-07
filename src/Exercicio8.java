import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a medida de um dos 3 lados do triângulo: ");
        double lado1 = scanner.nextInt();

        System.out.println("Informe a medida do segundo lado do triângulo: ");
        double lado2 = scanner.nextInt();

        System.out.println("Informe a medida do terceiro lado do triângulo: ");
        double lado3 = scanner.nextInt();

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("O triângulo é equilátero.");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("O triângulo é isóscele.");
        } else {
            System.out.println("O triângulo é escaleno.");
        }
    }
}
