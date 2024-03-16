package view;

import model.HealthProfile;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Informe o seu nome: ");
        String name = input.nextLine();

        System.out.print("Informe o seu sobrenome: ");
        String lastName = input.nextLine();

        System.out.print("Informe o seu sexo: ");
        String gender = input.nextLine();

        System.out.print("Informe a sua data de nascimento (dd/MM/yyyy): ");
        LocalDate dateOfBirth = LocalDate.parse(input.nextLine(), formatter);

        System.out.print("Informe a sua altura: ");
        double height = input.nextDouble();

        System.out.print("Informe o seu peso: ");
        double weight = input.nextDouble();

        input.close();

        HealthProfile profile = new HealthProfile(name, lastName, gender, dateOfBirth, height, weight);

        System.out.println("\n---------------------------------------------");
        System.out.printf("\tNome: %s %s%n", profile.getName(), profile.getLastName());
        System.out.println("\tSexo: "+ profile.getGender());
        System.out.println("\tData de Nascimento: "+ profile.getDateOfBirth().format(formatter));
        System.out.println("\tAltura: "+ profile.getHeight());
        System.out.println("\tPeso: "+ profile.getWeight());
        System.out.println("\tIdade: "+ profile.calculateAge());
        System.out.println("\tFrequência cardíaca máxima: "+ profile.calculateMaximumHeartRate());
        System.out.println("\tFrequência cardíaca alvo mínima: "+ profile.calculateMinimumTargetHeartRate());
        System.out.println("\tFrequência cardíaca alvo máxima: "+ profile.calculateMaximumTargetHeartRate());
        HealthProfile.printBmiTable();
        System.out.println("\tIMC: "+ profile.calculateBMI());
        System.out.println("---------------------------------------------");
    }
}
