import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("----------------------------------------");
        System.out.println("\tVALORES DO IMC");
        System.out.println("\tAbaixo do peso: menor que 18,5");
        System.out.println("\tNormal: entre 18,5 e 24,9");
        System.out.println("\tAcima do peso: entre 25 e 29,9");
        System.out.println("\tObesidade: maior que 30");
        System.out.println("----------------------------------------");

        System.out.print("Informe o seu peso em quilogramas: ");
        double peso = input.nextDouble();

        System.out.print("Informe a sua altura em metros: ");
        double altura = input.nextDouble();

        input.close();

        double imc = peso / (altura * altura);

        System.out.printf("O seu IMC é %.2f%n", imc);
    }
}