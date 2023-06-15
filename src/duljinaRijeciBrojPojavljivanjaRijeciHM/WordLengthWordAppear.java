package duljinaRijeciBrojPojavljivanjaRijeciHM;
import java.util.HashMap;

public class WordLengthWordAppear {

    public static void main(String[] args) {

        String input = "\novo je NeKI string, p% a samo 'String i' nista Vise i i !!#"; // input string
        HashMap<String, Integer> map = wordLengthWordAppear(input); //hashmapa koja sadrži riječi i broj ponavljanja

        System.out.println("Input: " + input); // ispis inputa
        System.out.println("Output:");
        System.out.println("------------------------------------------------");
        for (String word : map.keySet()) {
            int length = word.length();
            int repetition = map.get(word);
            System.out.printf("[%s] -> length: %d <-> repetition: %d%n", word, length, repetition); // ispis riječi, duljine i broja ponavljanja
        }
    }

    public static HashMap<String, Integer> wordLengthWordAppear(String sentence) { // metoda koja prima string i vraća hashmapu
        HashMap<String, Integer> map = new HashMap<>();
        String[] words = sentence.split("\\s+"); // splita string na riječi
        for (String word : words) { // prolazi kroz sve riječi
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase(); // zamjenjuje sve znakove koji nisu slova s praznim stringom i pretvara u mala slova
            if (!word.isEmpty()) { // ako riječ nije prazna
                if (map.containsKey(word)) { // ako riječ već postoji u mapi
                    map.put(word, map.get(word) + 1); // povećaj broj ponavljanja za 1
                } else {
                    map.put(word, 1); // inače dodaj riječ u mapu i postavi broj ponavljanja na 1
                }
            }
        }
        return map;
    }
}
