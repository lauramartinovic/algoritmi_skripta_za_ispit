package stringSortRek;

import java.util.Arrays;

public class StringSortRecursion {

/* U prvom dijelu ovog zadatka trebate realizirati jednostavni algoritam NaiveStringSort koji će listu stringova sortirati uzlazno prema
duljini stringova. Potom je potrebno osigurati rekurzivni ispis svakog elementa tako sortirane liste i njegovu duljinu, te za
 koliko je znakova kraći od naduljeg stringa u listi. Ovo vam govori da posljednji element sortirane liste ima taj parametar
 jednak nuli iz razloga što je on i najdulji pa u odnosu na sebe nije kraći niti dulji.
 */

    public static void main(String[] args) {
            String[] lista = {"ovo874", " je 34 487", "test", "za ovaje", "zadatak"};
            System.out.println(Arrays.toString(lista));
            naiveStringSort(lista);
            System.out.println(Arrays.toString(lista));
            rekurzivniIspis(lista, lista[lista.length - 1].length(), 0);
        }

        public static void naiveStringSort(String[] lista) { //sortira stringove po duljini
            for (int i = 0; i < lista.length; i++) { //bubble sort
                for (int j = 0; j < lista.length; j++) {
                    if (lista[i].length() < lista[j].length()) {
                        String temp = lista[i];
                        lista[i] = lista[j];
                        lista[j] = temp;
                    }
                }
            }
        }

        public static void rekurzivniIspis(String[] lista, int najduljina, int pocetak) { //rekurzivno ispisuje stringove i oduzima od najduljeg
            if (pocetak == lista.length) {
                return;
            } else {
                int leng = lista[pocetak].length();
                System.out.println("\nKraci od najduljeg stringa je za: " + (najduljina - leng));
                System.out.println("Duljina: " + leng);
                System.out.println("Element: " + lista[pocetak]);
                rekurzivniIspis(lista, najduljina, pocetak + 1);
            }
        }
    }
