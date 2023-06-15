package stogInverzIUkloniZnakove;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Collectors;

public class RemoveInterpunctions {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            List<String> lista = Arrays.asList(input.split(" "));
            System.out.println(lista);
            stogInverz(lista, 0, lista.size() - 1);
            List<String> nova = stog2Inverz(lista);
            System.out.println(nova);
            System.out.println(removeInterPunctions(nova));
        }

        public static void stogInverz(List<String> lista, int pocetak, int kraj) { //metoda koja inverzno sortira listu
            if (pocetak >= kraj) {
                return;
            } else {
                String temp = lista.get(pocetak);
                lista.set(pocetak, lista.get(kraj));
                lista.set(kraj, temp);
                stogInverz(lista, pocetak + 1, kraj - 1);
            }
        }

        public static List<String> stog2Inverz(List<String> lista) { //metoda koja stog pretvara u inverznu listu
            Stack<String> stog = new Stack<>();
            for (String element : lista) {
                stog.push(element);
            }
            return stog.stream().collect(Collectors.toList());
        }

        public static List<String> removeInterPunctions(List<String> lista) { //metoda koja uklanja interpunkcijske znakove iz liste
            String[] punc = {"!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<",
                    "=", ">", "?", "@", "[", "\\", "]", "^", "_", "`", "{", "|", "}", "~"};
            for (int i = 0; i < lista.size(); i++) {
                String rijec = lista.get(i);
                for (String slovo : punc) {
                    rijec = rijec.replace(slovo, "");
                }
                lista.set(i, rijec);
            }
            return lista;
        
        }
    
}
    


