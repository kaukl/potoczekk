package podstawy;

import java.util.Scanner;

public class zadanie8 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj wymiary 1 pokoju: ");
        int pomieszczenie1x = klawiatura.nextInt();
        int pomieszczenie1y = klawiatura.nextInt();
        System.out.println("Podaj wymiary 2 pokoju: ");
        int pomieszczenie2x = klawiatura.nextInt();
        int pomieszczenie2y = klawiatura.nextInt();
        System.out.println("Podaj wymiary 3 pokoju: ");
        int pomieszczenie3x = klawiatura.nextInt();
        int pomieszczenie3y = klawiatura.nextInt();
        System.out.println("Podaj wymiary 4 pokoju: ");
        int pomieszczenie4x = klawiatura.nextInt();
        int pomieszczenie4y = klawiatura.nextInt();
        int liczbaOsob = 4;

        int pow1 = pomieszczenie1x*pomieszczenie1y;
        int pow2 = pomieszczenie2x*pomieszczenie2y;
        int pow3 = pomieszczenie3x*pomieszczenie3y;
        int pow4 = pomieszczenie4x*pomieszczenie4y;

        int calkowitaPow = pow1 + pow2 + pow3 + pow4;
        double powNaOsobe = (double)calkowitaPow/liczbaOsob;

        System.out.println("Liczba osób: "+liczbaOsob);
        System.out.println("Całkowita powierzchnia: "+calkowitaPow);
        System.out.println("Całkowita powierzchnia na 1 osobę: "+powNaOsobe);
    }
}
