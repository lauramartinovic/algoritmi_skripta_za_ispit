package pronadiParneIGen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FindEven {
    public static void main(String[] args) {
        List<Integer> lista = generirajListu(8); // 8 je broj elemenata liste
        System.out.println(lista);
        List<Pair<Integer, Integer>> rezultat = pronadiParne(lista); // pronadiParne je metoda koja vraca listu parova
        System.out.println(rezultat);
    }

    public static List<Pair<Integer, Integer>> pronadiParne(List<Integer> lista) { // metoda koja vraca listu parova
        List<Pair<Integer, Integer>> parnaLista = new ArrayList<>(); // lista parova
        for (int i = 0; i < lista.size(); i++) { // prolazak kroz listu
            int broj = lista.get(i);
            if (broj % 2 == 0) {
                Pair<Integer, Integer> par = new Pair<>(broj, i);
                parnaLista.add(par);
            }
        }
        return parnaLista;
    }

    public static List<Integer> generirajListu(int broj) { // metoda koja generira listu
        List<Integer> lista = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < broj; i++) {
            int randomNum = rand.nextInt(100) + 1;
            lista.add(randomNum);
        }
        return lista;
    }

    static class Pair<T, U> { // klasa koja predstavlja par
        private final T first;
        private final U second;

        public Pair(T first, U second) { // konstruktor
            this.first = first;
            this.second = second;
        }

        public T getFirst() { // getteri
            return first;
        }

        public U getSecond() { // getteri
            return second;
        }

        @Override
        public String toString() {
            return "(" + first + ", " + second + ")";
        }
    }
}
