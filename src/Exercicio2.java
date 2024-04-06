import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Olá, vamos descobrir se você pode votar?");
        System.out.println("Digite seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        int podeVotar = 2024 - anoNascimento;

        if (podeVotar >= 16) {
            System.out.println("Parabéns, você já pode votar!");
        } else {
            int faltaIdade = 16 - podeVotar;
            System.out.println("Infelizmente você ainda não consegue votar. Faltam " + faltaIdade + " anos para você poder votar!");
        }

    }
}
