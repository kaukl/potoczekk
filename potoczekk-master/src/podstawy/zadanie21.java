package podstawy;

import java.util.Scanner;

public class zadanie21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kwotę pierwotnie zdeponowaną na koncie: ");
        double P = scanner.nextDouble();
        System.out.println("Podaj roczną stopę oprocentowania: ");
        double procenty = scanner.nextDouble();
        double r = procenty/100;
        System.out.println("Podaj, ile razy w roku odsetki są kapitalizowane " +
                "(np. przy kapitalizacji miesięcznej wpisz 12," +
                " a przy kapitalizacji kwartalnej - 4): ");
        int n = scanner.nextInt();
        System.out.println("Podaj liczbę lat, przez jakie środki będą znajdować" +
                " się na koncie i generować odsetki: ");
        double t = scanner.nextDouble();

        double A = P*Math.pow((1+r/n),n*t);

        System.out.println("Po "+t+" latach na koncie będzie się znajdować "+
                A+" złotych");
    }
}
