package maxUListi;

public class FindMax {

    public static void main(String[] args) {
        int[] lista1 = {23, 1, -100, 23, 44, 567, 10000, 0};
        int[] lista2 = {-2, 3, 50000, 89, 1000};
        int[] lista3 = {244, 456, 300, 3000, -100, 0, 6, 77, 88, 235000};
        int[] rezultat = findMaks(lista1, lista2, lista3); //poziv metode
        System.out.println("INDP: " + rezultat[1]); //indeks najvećeg broja u listi
        System.out.println("MAX: " + rezultat[0]); //najveći broj u listi
        System.out.println("IN ARRAY: " + rezultat[2]); //u kojoj listi se nalazi najveći broj
    }

    public static int[] findMaks(int[]... listeInput) { //metoda koja vraća najveći broj u listi, indeks najvećeg broja u listi i u kojoj listi se nalazi najveći broj
        System.out.println("=============");
        int brojliste = 0; //broj liste
        int max = Integer.MIN_VALUE; //najveći broj u listi
        int index = -1; //indeks najvećeg broja u listi
        int finalListe = -1; //u kojoj listi se nalazi najveći broj
        for (int[] lista : listeInput) { //petlja koja prolazi kroz sve liste
            brojliste++;
            System.out.println(java.util.Arrays.toString(lista)); //ispis liste
            int cnt = 0;
            for (int integer : lista) {
                if (integer > max) {
                    max = integer;
                    index = cnt;
                    finalListe = brojliste;
                }
                cnt++;
            }
        }
        System.out.println("=============");
        return new int[]{max, index, finalListe};
    }
}

