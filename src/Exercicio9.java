import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a medida do primeiro ângulo do triângulo: ");
        int angulo1 = scanner.nextInt();
        System.out.println("Informe a medida do segundo ângulo do triângulo: ");
        int angulo2 = scanner.nextInt();
        System.out.println("Informe a medida do terceiro ângulo do triângulo: ");
        int angulo3 = scanner.nextInt();

        int somaAngulos = angulo1 + angulo2 + angulo3;
        int numeroMx = 180;

        if (somaAngulos != numeroMx){
            System.out.println("Os valores dos ângulos passados não formam um triângulo. Lembr-se que um triângulo possui 180 de angulo.");
        } else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90){
            System.out.println("Triângulo ontusângulo.");
        } else if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
            System.out.println("Triângulo retângulo");
        } else {
            System.out.println("Triângulo acutângulo.");
        }
    }
}
