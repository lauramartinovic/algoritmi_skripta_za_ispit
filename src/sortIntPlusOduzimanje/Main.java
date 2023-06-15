package sortIntPlusOduzimanje;

import java.util.Arrays;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
        int[] lista = genArray(5, 1, 10);
        System.out.println(Arrays.toString(lista));
        int[] rezultat = simpleIntegerSort(lista);
        System.out.println(Arrays.toString(rezultat));
        recIspis(lista, 0, 0);
    }

    public static int[] simpleIntegerSort(int[] lista) { //sortira niz od najveceg do najmanjeg
        for (int i = 0; i < lista.length; i++) {
            for (int j = i + 1; j < lista.length; j++) {
                if (lista[i] < lista[j]) {
                    int temp = lista[i];
                    lista[i] = lista[j];
                    lista[j] = temp;
                }
            }
        }
        return lista;
    }

    public static int[] genArray(int broj, int mini, int maksi) { //generira niz od broja elemenata, od mini do maksi
        int[] niz = new int[broj];
        Random rand = new Random();
        for (int i = 0; i < broj; i++) {
            niz[i] = rand.nextInt((maksi - mini) + 1) + mini;
        }
        return niz;
    }

    public static void recIspis(int[] lista, int shifter, int maksi) { //rekurzivno ispisuje brojeve i oduzima od najveceg
        if (shifter == lista.length) {
            return;
        } else {
            System.out.println(lista[shifter]);
            System.out.println("Od najveceg je kraci za: " + (maksi - lista[shifter]));
            recIspis(lista, shifter + 1, maksi);
        }
    }
}

