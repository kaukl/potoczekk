package podstawy;

import java.util.Scanner;

public class zadanie13 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int pudelko = 40;
        int liczbaPorcjiwPudelku = 10;
        int porcja = pudelko/liczbaPorcjiwPudelku;
        int liczbaKaloriiwPorcji = 300;
        double liczbaKaloriiwCiasteczku = (double)liczbaKaloriiwPorcji/porcja;
        System.out.println("Podaj liczbę zjedzonych ciasteczek: ");
        int liczbaZjedzonychCiasteczek = klawiatura.nextInt();
        double kalorie = liczbaZjedzonychCiasteczek*liczbaKaloriiwCiasteczku;
        System.out.println("Zjadłeś "+kalorie+" kalorii");
    }
}
