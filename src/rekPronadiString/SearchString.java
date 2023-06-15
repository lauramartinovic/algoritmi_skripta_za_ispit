package rekPronadiString;
import java.util.List;
import java.util.ArrayList;

public class SearchString {

    public static void main(String[] args) {
        List<String> test = new ArrayList<>();
        test.add("Ovo je ");
        test.add("neki testni ");
        test.add("string");
        test.add("za test");
        test.add("je ");
        test.add("je");
        System.out.println(test);
        System.out.println("Test koda: ");
        searchForString(test, "string", 0, true);
    }

    public static Object[] searchForString(List<String> lista, String string, int shifter, boolean status) { //rekurzivna metoda koja traži string u listi koji je poslan kao argument
        if (!status) {
            System.out.println("Element [" + string + "] pronađen u listi na indeksnoj poziciji " + shifter);
            return new Object[]{lista, string, status};
        } else if (shifter == lista.size()) {
            status = false;
            System.out.println("Element [" + string + "] nije pronađen u listi!");
        } else if (lista.get(shifter).equals(string)) {
            status = false;
            return searchForString(lista, string, shifter, status);
        } else {
            return searchForString(lista, string, shifter + 1, status);
        }
        return null; // ovo je samo da se ne javlja greška u kodu
    }
}
