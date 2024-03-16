package model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class HeartRates {
    private String name;
    private String lastName;
    private LocalDate dateOfBirth;

    public HeartRates(String name, String lastName, LocalDate dateOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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
}
