import java.util.Scanner;

public class CrescimentoDemografico {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a população mundial atual em bilhões: ");
        double populacaoMundial = input.nextDouble();

        System.out.print("Informe a taxa de crescimento demográfico mundial: ");
        double crescimentoDemografico = input.nextDouble() / 100;

        input.close();

        double primeiroAno = populacaoMundial * (1 + crescimentoDemografico);
        double segundoAno = primeiroAno * (1 + crescimentoDemografico);
        double terceiroAno = segundoAno * (1 + crescimentoDemografico);
        double quartoAno = terceiroAno * (1 + crescimentoDemografico);
        double quintoAno = quartoAno * (1 + crescimentoDemografico);

        System.out.printf("A população mundial estimada após 1 ano seria aproximadamente %.3f bilhões%n", primeiroAno);
        System.out.printf("A população mundial estimada após 2 anos seria aproximadamente %.3f bilhões%n", segundoAno);
        System.out.printf("A população mundial estimada após 3 anos seria  aproximadamente %.3f bilhões%n", terceiroAno);
        System.out.printf("A população mundial estimada após 4 anos seria aproximadamente %.3f bilhões%n", quartoAno);
        System.out.printf("A população mundial estimada após 5 anos seria aproximadamente %.3f bilhões%n", quintoAno);
    }
}