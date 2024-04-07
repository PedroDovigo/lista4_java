import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        int primeiroMaior = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        System.out.println("Digite o terceiro número inteiro: ");
        int num3 = scanner.nextInt();

        if (num1 > num2 || num1 > num3){
            System.out.println("O maior número é o primerio (" + num1 + ")");
        } else if (num2 > num1 || num2 > num3){
            System.out.println("O maior número é o segundo (" + num2 + ")");
        } else if (num3 > num2 || num3 > num1) {
            System.out.println("O maior número é o terceiro (" + num3 + ")");
        }
    }
}
