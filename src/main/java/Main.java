//Napisz program, który oblicza wiek osoby na podstawie jej daty urodzenia:
//- Program powinien wczytać datę urodzenia wprowadzone przez użytkownika.
//- Obliczyć wiek na podstawie bieżącej daty.
//- Wyświetlić wynik.


import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
    System.out.print("Podaj date urodzenia wformacie RRRR-MM-DD:");
    String birthDateStr = scanner.next();
    LocalDate birthDate = LocalDate.parse(birthDateStr);
    LocalDate currentDate = LocalDate.now();
    int age = Period.between(birthDate, currentDate).getYears();
    System.out.println("Wiek: " + age + " lat");
    }
 }

