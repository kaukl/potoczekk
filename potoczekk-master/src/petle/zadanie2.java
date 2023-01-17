package petle;

import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz literę 'T', 't', 'N' lub 'n'");
        String litera = scanner.nextLine();
        while (!litera.equals("T") && !litera.equals("t") && !litera.equals("N") && !litera.equals("n")){
            System.out.println("Podałeś złą literę, podaj jeszcze raz:");
            litera = scanner.nextLine();
        }
        System.out.println("Dziękuję za wprowadzenie poprawnej litery");
    }
}
