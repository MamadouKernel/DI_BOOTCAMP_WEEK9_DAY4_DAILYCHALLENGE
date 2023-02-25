package exercice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExamples {

    public static void main(String[] args) {
        printCurrentDate();
        printCurrentTime();
        printCurrentDateTime();
        printFormattedDateTime();
        printMonthDaySecond();
        printSpecificDate();
        printCurrentDateTimeFormatted();
    }
    
    // Imprimer la date actuelle en utilisant LocalDate
    public static void printCurrentDate() {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date: " + currentDate);
    }
    
    // Imprimer l'heure actuelle en utilisant LocalTime
    public static void printCurrentTime() {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current time: " + currentDate.atTime(0, 0));
    }
    
    // Imprimer l'heure et la date actuelles à l'aide de LocalDateTime
    public static void printCurrentDateTime() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + currentDateTime);
    }
    
    // Imprimer dans un format particulier "jj-MM-aaaa HH:mm:ss"
    public static void printFormattedDateTime() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted date and time: " + formattedDateTime);
    }
    
    // Imprimer mois jours et secondes
    public static void printMonthDaySecond() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        int month = currentDateTime.getMonthValue();
        int day = currentDateTime.getDayOfMonth();
        int second = currentDateTime.getSecond();
        System.out.println("Month: " + month + ", Day: " + day + ", Second: " + second);
    }

    // Imprimer une date spécifiée "1950,1,26"
    public static void printSpecificDate() {
        LocalDate specificDate = LocalDate.of(1950, 1, 26);
        System.out.println("Specific date: " + specificDate);
    }
    
    // Imprimer la date avec l'heure actuelle
    public static void printCurrentDateTimeFormatted() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Current date and time formatted: " + formattedDateTime);
    }
}
