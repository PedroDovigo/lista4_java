package Exercicio15;

import java.util.Scanner;

public class ContaCorrente {
    private int numero;
    private float saldo = 5000;
    private boolean status;
    private float limite;

    public float getSaldo() {
        return saldo;
    }

    public void saque(float saque) {
        if (saque > saldo) {
            System.out.println("Você não possui o valor necessário.");
        } else if (saque <= 0) {
            System.out.println("Você não pode realizar saques negativos.");
        } else {
            this.saldo = saldo - saque;
            System.out.println("Saque realizado com sucesso! " + getSaldo());

        }
    }

    public void deposito(float deposito){
        if (deposito <= 0){
            System.out.println("Você não pode realizar saques negativos.");
        } else {
            this.saldo += deposito;
            System.out.println("Deposito realizado com sucesso! Seu novo saldo é R$" + getSaldo());
        }
    }

    public void consultarSaldo(){
        System.out.println("Seu saldo é de R$" + getSaldo());
    }

    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da opção desejada: \n1- Saque \n2- Deposito \n3- Consultar saldo \n4- Sair ");
        int menu = scanner.nextInt();


        while (menu < 1 || menu > 4) {
            System.out.println("Opção selecionada inválida, digite uma opção válida.");
            System.out.println("Digite o número da opção desejada: \n1- Saque \n2- Deposito \n3- Consultar saldo ");
            menu = scanner.nextInt();
        } if (menu == 1) {
            conta1.saque(2500);
        } else if (menu == 2) {
            conta1.deposito(5000);
        } else if (menu == 3) {
            System.out.println("Seu saldo é de R$" + conta1.getSaldo());
        } else if (menu == 4){
            System.out.println("Até a próxima");

        }

    }

}

