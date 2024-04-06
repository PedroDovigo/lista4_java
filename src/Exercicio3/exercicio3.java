package Exercicio3;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Senha SenhaCerta = new Senha();

        System.out.println("SENHA: ");
        int senhaEscrita = scanner.nextInt();

        if (senhaEscrita == SenhaCerta.getSenhaValida()) {
            System.out.println("Acesso liberado");
        } else {
            System.out.println("Acesso negado");
        }
    }
}





