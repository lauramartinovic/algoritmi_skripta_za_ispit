package maksVrijednostIndex;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MaxSearch {

    public static void main(String[] args) {
        List<Integer> lista = genList(6, 0, 15);
        System.out.println(lista);
        int maks = searchMaks(lista);
        List<Integer> indeksi = searchIndeksi(lista, maks);
        System.out.println("\nMaksimalna vrijednost: " + maks);
        System.out.println("Nalazi se na indeksnim pozicijama: " + indeksi);
    }

    public static List<Integer> genList(int broj, int mini, int maxi) { // generisanje liste brojeva od mini do maxi
        List<Integer> niz = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < broj; i++) {
            int randomNum = rand.nextInt((maxi - mini) + 1) + mini;
            niz.add(randomNum);
        }
        return niz;
    }

    public static int searchMaks(List<Integer> lista) { // trazenje maksimalne vrijednosti u listi
        int maks = lista.get(0);
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i) > maks) {
                maks = lista.get(i);
            }
        }
        return maks;
    }

    public static List<Integer> searchIndeksi(List<Integer> lista, int value) { // trazenje indeksa maksimalne vrijednosti u listi
        List<Integer> indeksi = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == value) {
                indeksi.add(i);
            }
        }
        return indeksi;
    }
}
