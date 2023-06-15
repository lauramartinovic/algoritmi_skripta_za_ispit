package brojanjeRijeci;
import java.util.Stack;


public class Words{
    public static void main(String[] args) {
        String str1 = "Samo neki string i i pa, jeste neki string.";
        String str2 = "ovo je opet neki drugi i jeste takav, pa što!";

        Stack<Integer> stack1 = new Stack<>(); // stog za prvu rečenicu
        Stack<Integer> stack2 = new Stack<>(); // stog za drugu rečenicu

        int sumLength = 0; // suma duljina riječi u obje rečenice

        sumLength += calculateWordLengths(str1, stack1); // računanje duljina riječi u prvoj rečenici
        sumLength += calculateWordLengths(str2, stack2); // računanje duljina riječi u drugoj rečenici

        // ispis rezultata

        System.out.println("=============================================");
        System.out.println("Input:");
        System.out.println("    str1 = \"" + str1 + "\"");
        System.out.println("    str2 = \"" + str2 + "\"");

        System.out.println("Output:");
        System.out.println("=============== Finished processing ===============");
        System.out.println("[" + str1 + " " + str2 + "]");

        System.out.println("---------------------------------------------");
        System.out.println("Prvi stog: " + stack1);
        System.out.println("---------------------------------------------");
        System.out.println("Suma: " + sumLength);
        System.out.println("---------------------------------------------");
        System.out.println("Drugi stog: " + stack2);
    }

    private static int calculateWordLengths(String sentence, Stack<Integer> lengthStack) { // računanje duljina riječi u rečenici
        String[] words = sentence.split("\\s+"); // razdvajanje rečenice na riječi
        int sumLength = 0; // suma duljina riječi u rečenici
        for (String word : words) { // prolazak kroz sve riječi u rečenici
            int length = word.replaceAll("[^a-zA-Z]", "").length(); // duljina riječi bez interpunkcije
            sumLength += length; // dodavanje duljine riječi na sumu
            lengthStack.push(length); // dodavanje duljine riječi na stog
        }
        return sumLength; // vraćanje sume duljina riječi u rečenici
    }
}
