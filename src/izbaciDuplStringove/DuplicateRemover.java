package izbaciDuplStringove;

import java.util.ArrayList;
import java.util.List;

public class DuplicateRemover {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>(); // lista koja sadrži duplikate
        lista.add("string");
        lista.add("koji");
        lista.add("ce");
        lista.add("CE");
        lista.add("se");
        lista.add("ukloniti");
        lista.add("ukloniti");
        lista.add("ajde");

        System.out.println(lista);
        List<String> rezultat = izbaciDupl(lista, 0, 0); // poziv metode koja uklanja duplikate
        System.out.println(rezultat); // ispis rezultata
    }

    public static List<String> izbaciDupl(List<String> lista, int element, int shifter) { // metoda koja uklanja duplikate, shifter je indeksni pomak
        if (element == lista.size()) { // ako je element jednak veličini liste, vraća listu
            return lista;
        } else if (shifter == lista.size()) {  // ako je shifter jednak veličini liste, vraća listu
            return izbaciDupl(lista, element + 1, 0); // poziv metode koja uklanja duplikate
        } else if (element == shifter) {
            return izbaciDupl(lista, element, shifter + 1);
        } else if (lista.get(element).equalsIgnoreCase(lista.get(shifter))) {
            lista.remove(shifter);
            return izbaciDupl(lista, element, shifter);
        } else {
            return izbaciDupl(lista, element, shifter + 1);
        }
    }
}

