package prebacivanjePrvogMalogSlovaUVeliko;

public class SentenceConversion {

        public static String convertSentence(String sentence) {
            String[] words = sentence.split("\\s+"); // Razdvajanje riječi po razmacima

            StringBuilder modifiedSentence = new StringBuilder();

            for (String word : words) {
                // Provjera da li riječ sadrži znamenke
                boolean containsDigits = word.matches(".*\\d.*");

                if (!containsDigits) {
                    // Ako ne sadrži znamenke, pretvaranje prvog slova u veliko slovo
                    String modifiedWord = word.substring(0, 1).toUpperCase() + word.substring(1);
                    modifiedSentence.append(modifiedWord).append(" ");
                } else {
                    // Inače, ostaviti riječ nepromijenjenu
                    modifiedSentence.append(word).append(" ");
                }
            }

            return modifiedSentence.toString().trim();
        }

        public static void main(String[] args) {
            String sentence = "ovo je neka rečenica, a smatramo 123 da je dovoljno duga - nikakav proble11m za nas.";

            String modifiedSentence = convertSentence(sentence);

            System.out.println("Input:\n" + sentence);
            System.out.println("Output:\n--------------------------------------------------------------------");
            System.out.println(modifiedSentence);
        }
    }
