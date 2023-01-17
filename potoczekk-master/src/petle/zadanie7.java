package petle;

import java.util.Scanner;

public class zadanie7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba;
        int suma = 0;
        for (int i = 0; i < 7; i++) {
            System.out.println("Podaj liczbę:");
            liczba = scanner.nextInt();
            suma += liczba;
        }
        System.out.println(suma);
    }
}
