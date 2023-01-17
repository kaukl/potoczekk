package podstawy;

public class zadanie5 {
    public static void main(String[] args) {
        int pomieszczenie1x = 3;
        int pomieszczenie1y = 4;
        int pomieszczenie2x = 3;
        int pomieszczenie2y = 4;
        int pomieszczenie3x = 2;
        int pomieszczenie3y = 3;
        int pomieszczenie4x = 2;
        int pomieszczenie4y = 2;

        int pow1 = pomieszczenie1x*pomieszczenie1y;
        int pow2 = pomieszczenie2x*pomieszczenie2y;
        int pow3 = pomieszczenie3x*pomieszczenie3y;
        int pow4 = pomieszczenie4x*pomieszczenie4y;

        int calkowitaPow = pow1 + pow2 + pow3 + pow4;

        System.out.println("Powierzchnia 1 pomieszczenia: "+pow1);
        System.out.println("Powierzchnia 2 pomieszczenia: "+pow2);
        System.out.println("Powierzchnia 3 pomieszczenia: "+pow3);
        System.out.println("Powierzchnia 4 pomieszczenia: "+pow4);
        System.out.println("Całkowita powierzchnia: "+calkowitaPow);
    }

}
