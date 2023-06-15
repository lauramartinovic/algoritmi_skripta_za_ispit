package struktpodataka;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Zadatak1 {

    public static void main(String[] args) {

        int mx; //ovo je max broj u arrayu

        int [] array = arrayNums(10); //ovo je array koji sadrži random brojeve

        mx = returnMaksi(array); //ovo je max broj u arrayu

        System.out.println("Array: ");
        System.out.println(Arrays.toString(array));
        System.out.println("Max: " + mx);
    }


    public static int[] arrayNums(int N){ //metoda koja vraća array random brojeva do 300

        int[] array = new int[N]; //ovo je array koji sadrži random brojeve, N je broj elemenata u arrayu

        for (int i = 0; i <N; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(0, 301); //random brojevi od 0 do 300

        }
        return array;

    }
    public static int returnMaksi(int[] array){ //metoda koja vraća max broj u arrayu

        int maksi = array[0]; //ovo je max broj u arrayu koji se postavlja na prvi element arraya

        int res = 1; //ovo je rezultat koji se postavlja na 1 jer je prvi element arraya već postavljen kao max

        while (res < array.length) { //dok je rezultat manji od duljine arraya
            if(maksi < array[res]) { //ako je max manji od elementa arraya
                maksi = array[res]; //max postaje taj element
                res +=1; //rezultat se povećava za 1
            }else {
                res += 1; //ako nije, rezultat se povećava za 1
            }
        }


        return maksi;

    }
}
