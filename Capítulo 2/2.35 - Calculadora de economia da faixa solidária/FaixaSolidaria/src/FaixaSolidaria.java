import java.util.Scanner;

public class FaixaSolidaria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a quantidade de quilômetros totais dirigidos por dia: ");
        double kmRodados = input.nextDouble();

        System.out.print("Informe o preço do litro de gasolina: ");
        double precoGasolina = input.nextDouble();

        System.out.print("Informe o consumo de gasolina do carro em quilômetros por litro: ");
        double kmPorLitro = input.nextDouble();

        System.out.print("Informe o valor total de taxas de estacionamento por dia: ");
        double taxaEstacionamento = input.nextDouble();

        System.out.print("Informe o valor total de taxas de pedágio por dia: ");
        double pedagioPorDia = input.nextDouble();

        input.close();

        double custoDiario = kmRodados / kmPorLitro * precoGasolina + taxaEstacionamento + pedagioPorDia;

        System.out.printf("O custo diário de dirigir para o trabalho é R$%.2f%n", custoDiario);
    }
}