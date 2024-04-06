import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        float num1 = scanner.nextFloat();

        System.out.println("Digite o segundo valor: ");
        float num2 = scanner.nextFloat();

        String resultado = num1 > num2 ? "O primeiro valor é maior." : "O segundo valor é maior.";
        System.out.println(resultado);
    }
}
