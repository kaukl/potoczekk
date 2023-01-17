package petle;

public class zadanie12 {
    public static void main(String[] args) {
        double liczba;
        double suma = 0;
        for (double i = 1; i <= 30; i++) {
            liczba = i/(31-i);
            suma += liczba;
        }
        System.out.println(suma);
    }
}
