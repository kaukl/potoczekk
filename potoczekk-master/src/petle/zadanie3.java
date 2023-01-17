package petle;

import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz 'Tak' lub 'Nie':");
        String tak = scanner.nextLine();
        while (!tak.equals("Tak") && !tak.equals("Nie")) {
            System.out.println("Wpisałeś niewłaściwe słowo, wpisz jeszcze raz:");
            tak = scanner.nextLine();
        }
        System.out.println("Dziękuję za wprowadzenie właściwego słowa");
    }
}
