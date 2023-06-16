package roundRobinSchStringovi;

import java.util.ArrayList;
import java.util.List;

public class RoundRobinScheduling {

    /* U ovom problemu trebate koristiti princip rada Round Robin Scheduling algoritma kako biste napravili algoritam koji za
    proizvoljni niz stringova ispisuje tu strukturu, a potom cirkularno u svakom koraku svakom stringu uklanja
     po jedno slovo (zadnje). String koji više nema slova za obradu ispada iz liste. Postupak se završava kada više nema stringova za obradu.
     */

    public static void main(String[] args) {
        List<String> stringovi = new ArrayList<>();
        stringovi.add("samo neki");
        stringovi.add("tamo");
        stringovi.add("primjer");
        stringovi.add("i");
        stringovi.add("tako");
        stringovi.add("nesto");

        roundRobinScheduling(stringovi);
    }

    public static void roundRobinScheduling(List<String> stringovi) {
        List<String> obradjeniStringovi = new ArrayList<>(stringovi); //kopira listu stringovi u obradjeniStringovi

        while (!obradjeniStringovi.isEmpty()) { //dok obradjeniStringovi nije prazan
            System.out.println(obradjeniStringovi); //ispisuje obradjeniStringovi
            System.out.println("=========================================================");

            List<String> novaLista = new ArrayList<>(); //nova lista

            for (String string : obradjeniStringovi) { //za svaki string u obradjeniStringovi
                if (!string.isEmpty()) { //ako string nije prazan
                    String novaVerzija = string.substring(0, string.length() - 1); //novaVerzija je string od 0 do duljine stringa - 1
                    if (!novaVerzija.isEmpty()) { //ako novaVerzija nije prazna
                        novaLista.add(novaVerzija); //dodaj novuVerziju u novuListu
                    }
                }
            }

            obradjeniStringovi = novaLista; //obradjeniStringovi je novaLista
        }

        System.out.println("Finished!!!");
    }
}
