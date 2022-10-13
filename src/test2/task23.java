package test2;

import java.util.Random;

public class task23 {

    public static void main(String[] args) {

        int a = 0;
        int[] mas = new int[15];
        for(int i = 0; i < mas.length; i++) {
            Random rnd =new Random();
            mas[i] = rnd.nextInt(99) + 1;
            System.out.print(mas[i] + " ");
            if (mas[i] % 2 == 0)
                a++;
        }
        System.out.println(" ");
        System.out.println("В массиве " + a + " четных чисел");
    }
}

