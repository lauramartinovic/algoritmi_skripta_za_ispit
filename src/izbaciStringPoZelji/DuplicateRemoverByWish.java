package izbaciStringPoZelji;

import java.util.ArrayList;
import java.util.List;

//koristimo bubble sort

public class DuplicateRemoverByWish {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>(); //ovo je lista koju cemo sortirati
        lista.add("string");
        lista.add("koji");
        lista.add("ce");
        lista.add("CE");
        lista.add("se");
        lista.add("ukloniti");
        lista.add("ukloniti");
        lista.add("ajde");

        System.out.println(lista);
        List<String> rez = izbaciDupl(lista, 0, 0); // poziv metode koja uklanja duplikate
        System.out.println(rez);
        rez = simpleStringSort(rez); // poziv metode koja sortira listu
        System.out.println(rez); // ispis rezultata
    }

    public static List<String> izbaciDupl(List<String> lista, int element, int shifter) {
        if (element == lista.size()) {
            return lista;
        } else if (shifter == lista.size()) {
            return izbaciDupl(lista, element + 1, 0);
        } else if (element == shifter) {
            return izbaciDupl(lista, element, shifter + 1);
        } else if (lista.get(element).equalsIgnoreCase(lista.get(shifter))) {
            lista.remove(lista.get(shifter));
            return izbaciDupl(lista, element, shifter);
        } else {
            return izbaciDupl(lista, element, shifter + 1);
        }
    }

    public static List<String> simpleStringSort(List<String> lista) { // metoda koja sortira listu. Koristimo bubble sort
        for (int i = 0; i < lista.size(); i++) { // i = 0 jer zelimo uspoređivati sve elemente
            for (int j = i + 1; j < lista.size(); j++) { // j = i + 1 jer ne zelimo uspoređivati isti element
                if (lista.get(i).length() < lista.get(j).length()) { // ako je duljina elementa na poziciji i manja od duljine elementa na poziciji j, zamijeni mjesta
                    String temp = lista.get(i); // temp je privremena varijabla koja sadrži element na poziciji i
                    lista.set(i, lista.get(j));
                    lista.set(j, temp);
                }
            }
        }
        return lista;
    }
}

