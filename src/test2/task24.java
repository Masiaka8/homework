package test2;

import java.util.Random;

public class task24 {

    public static void main(String[] args) {

        int[] Mas = new int[20];
        for (int i = 0; i < Mas.length; i++) {
            Random rnd = new Random();
            Mas[i] = rnd.nextInt(20) + 1;
            System.out.print(Mas[i] + " ");
        }
        for (int i = 0; i < Mas.length; i++) {
            if (Mas[i] % 2 != 0)
                Mas[i] = 0;
            System.out.println(Mas[i] + " ");
        }
    }
}
