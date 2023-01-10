package podstawy;

import java.util.Scanner;

public class zadanie16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę ulubionego miasta: ");
        String miasto = scanner.nextLine();
        String miastoWielkimi = miasto.toUpperCase();
        String miastoMalymi = miasto.toLowerCase();
        char pierwszaLiteraMiasta = miasto.charAt(0);
        int dlugosc = miasto.length();

        System.out.println(dlugosc);
        System.out.println(miastoWielkimi);
        System.out.println(miastoMalymi);
        System.out.println(pierwszaLiteraMiasta);
    }
}
