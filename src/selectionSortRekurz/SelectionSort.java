package selectionSortRekurz;

public class SelectionSort {


    /* Realizirajte selection sort algoritam primjenom rekurzije na način da kao ulaz možete primiti sekvencijalnu strukturu podataka.
    Ako je struktura sortirana, vaše rješenje odmah treba dati poruku Initially sorted!!! i ispis strukture ,
    a u suprotnom će provesti rekurzivni selection sort algoritam i na kraju ispisati Soreted!!! i sortiranu strukturu podataka.
     */

    public static void main(String[] args) {
        int[] niz = {5, 4, 3, 2, 1};
        selectionSort(niz, 0);

    }

        public static void selectionSort ( int[] niz, int shifter){
            if (shifter == niz.length) { // ako je shifter jednak duljini niza, onda je niz sortiran
                System.out.println("Sorted!!!");
                for (int i = 0; i < niz.length; i++) { // ispisuje sortirani niz
                    System.out.print(niz[i] + " ");
                }
                return;
            } else {
                int min = niz[shifter]; // min je prvi element niza
                int minIndex = shifter;
                for (int i = shifter; i < niz.length; i++) {
                    if (niz[i] < min) {
                        min = niz[i];
                        minIndex = i;
                    }
                }
                int temp = niz[shifter];
                niz[shifter] = min;
                niz[minIndex] = temp;
                selectionSort(niz, shifter + 1);
            }
        }

    }

