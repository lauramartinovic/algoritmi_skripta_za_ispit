package rekIstaDuljina;

import java.util.ArrayList;
import java.util.List;

public class RemoveByLength {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>(); // ovo je isto kao i String[] lista = new String[10];
        lista.add("ovo");
        lista.add("je");
        lista.add("neki");
        lista.add("string");
        lista.add("ima");
        lista.add("elemenata");
        lista.add("više");
        lista.add("od");
        lista.add("tri");
        System.out.println("Pocetna lista: " + lista);
        rekString(lista, 3, 0);
        System.out.println("Zavrsna lista: " + lista);
    }

    public static void rekString(List<String> lista, int duljina, int shifter) { //rekurzivna metoda koja prima listu, duljinu i shifter
        if (shifter == lista.size()) {
            return;
        } else {
            if (lista.get(shifter).length() != duljina) {
                lista.remove(shifter);
                rekString(lista, duljina, shifter);
            } else {
                rekString(lista, duljina, shifter + 1);
            }
        }
    }
}

