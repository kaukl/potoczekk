package ify;

import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String rzymska = "";
        int liczba = 0;
        int licznik = 0;
        System.out.println("Podaj, w którą stronę chcesz przeliczać: ");
        System.out.println("1 - z dziesiętnego na rzymski");
        System.out.println("2 - z rzymskiego na dziesiętny");
        int sposob = scanner.nextInt();
        scanner.nextLine();
        while (sposob >2 || sposob < 1){
            System.out.println("Podałeś złą liczbę, podaj jeszcze raz: ");
            sposob = scanner.nextInt();
            scanner.nextLine();
        }
        if (sposob == 1){
            System.out.println("Podaj liczbę: ");
            liczba = scanner.nextInt();
            while (liczba >= 1000){
                rzymska = rzymska+"M";
                liczba = liczba - 1000;
            }
            if (liczba >= 900){
                rzymska = rzymska+"CM";
                liczba = liczba - 900;
            }
            if (liczba >= 500){
                rzymska = rzymska+"D";
                liczba = liczba - 500;
            }
            if (liczba >= 400){
                rzymska = rzymska+"CD";
                liczba = liczba - 400;
            }
            while (liczba >= 100){
                rzymska = rzymska+"C";
                liczba = liczba - 100;
            }
            if (liczba >= 90){
                rzymska = rzymska+"XC";
                liczba = liczba - 90;
            }
            if (liczba >= 50){
                rzymska = rzymska+"L";
                liczba = liczba - 50;
            }
            if (liczba >= 40){
                rzymska = rzymska+"XL";
                liczba = liczba - 40;
            }
            while (liczba >= 10){
                rzymska = rzymska+"X";
                liczba = liczba - 10;
            }
            if (liczba >= 9){
                rzymska = rzymska+"IX";
                liczba = liczba - 9;
            }
            if (liczba >= 5){
                rzymska = rzymska+"V";
                liczba = liczba - 5;
            }
            if (liczba >=4){
                rzymska = rzymska+"IV";
                liczba = liczba - 4;
            }
            while (liczba >=1){
                rzymska = rzymska+"I";
                liczba = liczba - 1;
            }
            System.out.println(rzymska);
        }
        else {
            System.out.println("Podaj liczbę: ");
            rzymska = scanner.nextLine();
            while (rzymska.charAt(licznik) == 'M'){
                liczba = liczba + 1000;
                licznik = licznik + 1;
            }
            if (rzymska.charAt(licznik) == 'C' && rzymska.charAt(licznik+1) == 'M'){
                liczba = liczba + 900;
                licznik = licznik + 2;
            }
            if (rzymska.charAt(licznik) == 'D'){
                liczba = liczba + 500;
                licznik = licznik + 1;
            }
            if (rzymska.charAt(licznik) == 'C' && rzymska.charAt(licznik+1) == 'D'){
                liczba = liczba + 400;
                licznik = licznik + 2;
            }
            while (rzymska.charAt(licznik) == 'C') {
                liczba = liczba + 100;
                licznik = licznik + 1;
            }
            if (rzymska.charAt(licznik) == 'X' && rzymska.charAt(licznik+1) == 'C'){
                liczba = liczba + 90;
                licznik = licznik + 2;
            }
            if (rzymska.charAt(licznik) == 'L'){
                liczba = liczba + 50;
                licznik = licznik + 1;
            }
            if (rzymska.charAt(licznik) == 'X' && rzymska.charAt(licznik+1) == 'L'){
                liczba = liczba + 40;
                licznik = licznik + 2;
            }
            while (rzymska.charAt(licznik) == 'X') {
                liczba = liczba + 10;
                licznik = licznik + 1;
            }
            if (rzymska.charAt(licznik) == 'I' && rzymska.charAt(licznik+1) == 'X'){
                liczba = liczba + 9;
                licznik = licznik + 2;
            }
            if (rzymska.charAt(licznik) == 'V'){
                liczba = liczba + 5;
                licznik = licznik + 1;
            }
            if (rzymska.charAt(licznik) == 'I' && rzymska.charAt(licznik+1) == 'V'){
                liczba = liczba + 4;
                licznik = licznik + 2;
            }
            while (rzymska.charAt(licznik) == 'I') {
                liczba = liczba + 1;
                licznik = licznik + 1;
            }
        }
    }
}
