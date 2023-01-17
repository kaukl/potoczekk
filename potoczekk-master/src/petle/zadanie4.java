package petle;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje imię:");
        String imie = scanner.nextLine();
        for (int i = 0; i < 10; i++){
            System.out.println(imie);
        }
    }
}
