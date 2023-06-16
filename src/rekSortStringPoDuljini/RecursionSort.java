package rekSortStringPoDuljini;

import java.util.Arrays;

public class RecursionSort {

    /* Vaš zadatak je da realizirate rekurzivni algoritam sortiranja nekog niza stringova prema njihovoj duljini.
    Za ovaj slučaj samo osigurajte sortiranje od najduljeg prema najkraćem, a u pseudokodu navedite rješenje koje u sebi uključuje
    obje mogućnosti (od najkraćeg prema duljem i obrnuto).
     */

    public static void main(String[] args) {
        String[] lista = {"samo", "je", "ovo je dobro", "i", "neki-mali", "primjer", "opet"};
        System.out.println("Input Array:");
        System.out.println(Arrays.toString(lista));
        sortRec(lista, 0, 0);
        System.out.println("Recursion result:");
        System.out.println(Arrays.toString(lista));
    }

    public static void sortRec(String[] lista, int element, int shifter) { //rekurzivno sortira stringove po duljini
        if (element == lista.length) { //ovo je bubble sort
            return;
        } else if (shifter == lista.length) {
            sortRec(lista, element + 1, 0);
        } else if (lista[element].length() > lista[shifter].length()) {
            String temp = lista[element];
            lista[element] = lista[shifter];
            lista[shifter] = temp;
            sortRec(lista, element, shifter + 1);
        } else {
            sortRec(lista, element, shifter + 1);
        }
    }
}
