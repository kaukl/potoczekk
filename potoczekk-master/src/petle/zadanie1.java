package petle;

import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę z zakresu od 10 do 24");
        int liczba = scanner.nextInt();
        while (liczba < 10 || liczba > 24){
            System.out.println("Podałeś złą liczbę");
            System.out.println("Podaj liczbę jeszcze raz:");
            liczba = scanner.nextInt();
        }
        System.out.println("Dziękuję za wprowadzenie poprawnej liczby");
    }
}
