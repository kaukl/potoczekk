package podstawy;

import java.util.Scanner;

public class zadanie20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double makaNa48Ciasteczek = 2.75;
        double masloNa48Ciasteczek = 1;
        double cukierNa48Ciasteczek = 1.5;

        double makaNa1Ciasteczko = makaNa48Ciasteczek/48;
        double masloNa1Ciasteczko = masloNa48Ciasteczek/48;
        double cukierNa1Ciasteczko = cukierNa48Ciasteczek/48;

        System.out.println("Podaj liczbę ciasteczek do upieczenia: ");
        int liczbaCiasteczek = scanner.nextInt();

        double potrzebnaMaka = makaNa1Ciasteczko*liczbaCiasteczek;
        double potrzebneMaslo = masloNa1Ciasteczko*liczbaCiasteczek;
        double potrzebnyCukier = cukierNa1Ciasteczko*liczbaCiasteczek;

        System.out.println("Potrzebujesz "+potrzebnaMaka+" szklanek mąki, "+
                potrzebneMaslo+" szklanek masła "+potrzebnyCukier+
                " szklanek cukru");
    }
}
