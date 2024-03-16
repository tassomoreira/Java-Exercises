package model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class HealthProfile {
    private String name;
    private String lastName;
    private String gender;
    private LocalDate dateOfBirth;
    private double height;
    private double weight;

    public HealthProfile(String name, String lastName, String gender, LocalDate dateOfBirth, double height, double weight) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int calculateAge() {
        return (int)dateOfBirth.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    public int calculateMaximumHeartRate() {
        return 220 - calculateAge();
    }

    public double calculateMinimumTargetHeartRate() {
        return calculateMaximumHeartRate() * 0.5;
    }

    public double calculateMaximumTargetHeartRate() {
        return calculateMaximumHeartRate() * 0.85;
    }

    public double calculateBMI() {
        return weight / (height * height);
    }

    public static void printBmiTable() {
        System.out.println("---------------------------------------------");
        System.out.println("\tVALORES DO IMC");
        System.out.println("\tAbaixo do peso: menor que 18,5");
        System.out.println("\tNormal: entre 18,5 e 24,9");
        System.out.println("\tAcima do peso: entre 25 e 29,9");
        System.out.println("\tObesidade: maior que 30");
        System.out.println("---------------------------------------------");
    }
}
