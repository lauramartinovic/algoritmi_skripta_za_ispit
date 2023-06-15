package parnaINeparnaLista;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EvenOdd {
    public static void main(String[] args) {
        List<Integer> lista = genArray(7, 1, 10); //ovo je poziv funkcije koja generira listu
        System.out.println("Originalna lista: " + lista);
        List<List<Integer>> rezultat = parnnepar(lista); //ovo je poziv funkcije koja vraća listu listi
        System.out.println("Parna lista iz funkcije: " + rezultat.get(0)); //ovo je ispis liste koja je na poziciji 0 u listi
        System.out.println("Neparna lista iz funkcije: " + rezultat.get(1)); //ovo je ispis liste koja je na poziciji 1 u listi
    }

    public static List<List<Integer>> parnnepar(List<Integer> lista) { //ovo je funkcija koja vraća listu listi
        List<Integer> parnalista = new ArrayList<>();
        List<Integer> neparnalista = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) { //ovo je petlja koja prolazi kroz listu
            int broj = lista.get(i);
            if (broj % 2 == 0) { //ovo je uvjet koji provjerava je li broj paran ili neparan
                parnalista.add(broj);
            } else {
                neparnalista.add(broj);
            }
        }
        List<List<Integer>> rezultat = new ArrayList<>(); //Lista koja sadrži dvije liste
        rezultat.add(parnalista);
        rezultat.add(neparnalista);
        return rezultat;
    }

    public static List<Integer> genArray(int broj, int mini, int maksi) { //ovo je funkcija koja generira listu
        List<Integer> lista = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < broj; i++) { //ovo je petlja koja prolazi kroz listu i dodaje random brojeve
            int randomNum = rand.nextInt((maksi - mini) + 1) + mini;
            lista.add(randomNum);
        }
        return lista;
    }
}
