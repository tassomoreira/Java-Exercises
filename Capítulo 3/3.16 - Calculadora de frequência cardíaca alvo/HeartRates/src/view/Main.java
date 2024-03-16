package view;

import model.HeartRates;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Informe o seu nome: ");
        String name = input.nextLine();

        System.out.print("Informe o seu sobrenome: ");
        String lastName = input.nextLine();

        System.out.print("Informe a sua data de nascimento (dd/MM/yyyy): ");
        LocalDate dateOfBirth = LocalDate.parse(input.nextLine(), formatter);

        input.close();

        HeartRates person = new HeartRates(name, lastName, dateOfBirth);

        System.out.println("\n---------------------------------------------");
        System.out.printf("\tNome: %s %s%n", person.getName(), person.getLastName());
        System.out.println("\tData de Nascimento: "+ person.getDateOfBirth().format(formatter));
        System.out.println("\tIdade: "+ person.calculateAge());
        System.out.println("\tFrequência cardíaca máxima: "+ person.calculateMaximumHeartRate());
        System.out.println("\tFrequência cardíaca alvo mínima: "+ person.calculateMinimumTargetHeartRate());
        System.out.println("\tFrequência cardíaca alvo máxima: "+ person.calculateMaximumTargetHeartRate());
        System.out.println("---------------------------------------------");
    }
}
