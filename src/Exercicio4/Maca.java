package Exercicio4;

import java.util.Scanner;

public class Maca {
    private double poucasMacas = 0.30;
    private double muitasmacas = 0.25;

    public double getPoucasMacas() {
        return poucasMacas;
    }

    public double getMuitasmacas() {
        return muitasmacas;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Maca maca1 = new Maca();

        System.out.println("Digite quantas unidades de maçãs você comprou: ");
        int quantidadeMacas = scanner.nextInt();

        if (quantidadeMacas >= 12) {
            double soma = quantidadeMacas * maca1.getMuitasmacas();
            System.out.println("Você comprou mais de 12 maçãs, saindo por apenas R$" + maca1.getMuitasmacas() + " centavos cada unidade!");
            System.out.println("No total sua compra ficou: R$" + soma);
        } else {
            double soma = quantidadeMacas * maca1.getPoucasMacas();
            System.out.println("Você comprou" + quantidadeMacas + " , saindo por R$" + maca1.getPoucasMacas() + " centavos cada unidade!");
            System.out.println("No total sua compra ficou: R$" + soma);
        }
    }
}
