//Napisz program, który sprawdza, czy dane słowo jest palindromem:
 //- Program powinien wczytać słowo wprowadzone przez użytkownika.
 //- Sprawdzić, czy słowo jest palindromem.
 //- Wyświetlić odpowiedni komunikat.


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

