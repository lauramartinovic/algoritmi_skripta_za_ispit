package redoviRandomPunjenjePlusSuma;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class Redovi {

    /* Na raspolaganju imate tri reda s kapacitetima od 5, 7 i 11 elemenata. Sva tri se pune realnim brojevima slučajno generiranim
    iz raspona [0.0, 100.0]. Osigurajte dva reda odgovarajućih kapaciteta uzimajući u obzir da će se jedan puniti svim parnim
    elementima iz prethoda tri reda, a drugi svim neparnim elementima. Na kraju izvršite ispis elemenata novoformiranih redova po
    principu element po element. Također, trebate definirati dva "akumulatora" za izračunavanje sume. Prvi će predstavljati sumu reda s
    parnim elementima, a drugi sumu reda s neparnim elementima.
     */

    public static void main(String[] args) {

        Queue<Double> redParni = new LinkedList<>(); // Ovdje se stvara red parnih brojeva
        Queue<Double> redNeparni = new LinkedList<>(); // Ovdje se stvara red neparnih brojeva

        Queue<Double> red1 = generirajRed(5); // Ovdje pozivamo metodu za generiranje reda s 5 nasumičnih brojeva
        Queue<Double> red2 = generirajRed(7); // Ovdje pozivamo metodu za generiranje reda s 7 nasumičnih brojeva
        Queue<Double> red3 = generirajRed(11);  // Ovdje pozivamo metodu za generiranje reda s 11 nasumičnih brojeva

        // Punjenje redova parnim i neparnim elementima
        puniRedove(red1, red2, red3, redParni, redNeparni);

        // Ispis elemenata novoformiranih redova
        System.out.println("Red s parnim elementima:");
        ispisiRed(redParni);

        System.out.println("\nRed s neparnim elementima:");
        ispisiRed(redNeparni);

        // Izračunavanje suma
        double sumaParni = izracunajSumu(redParni);
        double sumaNeparni = izracunajSumu(redNeparni);

        System.out.println("\nSuma reda s parnim elementima: " + sumaParni);
        System.out.println("Suma reda s neparnim elementima: " + sumaNeparni);
    }

    // Metoda za generiranje reda s nasumičnim brojevima iz raspona [0.0, 100.0]
    public static Queue<Double>  generirajRed(int kapacitet) {
        Queue<Double> red = new LinkedList<>();

        //Možemo li ovdje koristit threadlocalrandom? Da, možemo. Kako? Pogledajte u nastavku.

        int rand = ThreadLocalRandom.current().nextInt(0, 100);
        for (int i = 0; i < kapacitet; i++) {
            red.offer((double) rand);
        }
       return red;

    }


    // Metoda za punjenje redova parnim i neparnim elementima
    public static void puniRedove(Queue<Double> red1, Queue<Double> red2, Queue<Double> red3,
                                  Queue<Double> redParni, Queue<Double> redNeparni) {
        while (!red1.isEmpty() || !red2.isEmpty() || !red3.isEmpty()) {
            if (!red1.isEmpty()) {
                double broj = red1.poll();
                if (broj % 2 == 0) {
                    redParni.offer(broj);
                } else {
                    redNeparni.offer(broj);
                }
            }

            if (!red2.isEmpty()) {
                double broj = red2.poll();
                if (broj % 2 == 0) {
                    redParni.offer(broj);
                } else {
                    redNeparni.offer(broj);
                }
            }

            if (!red3.isEmpty()) {
                double broj = red3.poll();
                if (broj % 2 == 0) {
                    redParni.offer(broj);
                } else {
                    redNeparni.offer(broj);
                }
            }
        }
    }

    // Metoda za ispis elemenata reda
    public static void ispisiRed(Queue<Double> red) {
        for (double broj : red) {
            System.out.print(broj + " ");
        }
    }

    // Metoda za izračunavanje sume elemenata reda
    public static double izracunajSumu(Queue<Double> red) {
        double suma = 0.0;
        for (double broj : red) {
            suma += broj;
        }
        return suma;
    }
}
