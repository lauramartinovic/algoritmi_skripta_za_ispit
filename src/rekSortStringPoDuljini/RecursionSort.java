package rekSortStringPoDuljini;

import java.util.Arrays;

public class RecursionSort {
    public static void main(String[] args) {
        String[] lista = {"samo", "je", "ovo je dobro", "i", "neki-mali", "primjer", "opet"};
        System.out.println("Input Array:");
        System.out.println(Arrays.toString(lista));
        sortRec(lista, 0, 0);
        System.out.println("Recursion result:");
        System.out.println(Arrays.toString(lista));
    }

    public static void sortRec(String[] lista, int element, int shifter) { //rekurzivno sortira stringove po duljini
        if (element == lista.length) {
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
