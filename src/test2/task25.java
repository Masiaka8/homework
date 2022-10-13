package test2;

import java.util.Random;

public class task25 {
    public static void main(String[] args) {
        double summas1 = 0;
        double summas2 = 0;
        int[] mas1 = new int[5];
        for (int i = 0; i < mas1.length; i++) {
            Random rnd = new Random();
            mas1[i] = rnd.nextInt(15) + 1;
            System.out.print(mas1[i] + " ");
            summas1 += (double)mas1[i] / mas1.length;
        }
        System.out.println(" ");

        int[] mas2 = new int[5];
        for (int i = 0; i < mas2.length; i++) {
            Random rnd = new Random();
            mas2[i] = rnd.nextInt(15) + 1;
            System.out.print(mas2[i] + " ");
            summas1 += (double)mas2[i] / mas2.length;
        }
        System.out.println(" ");

        if (summas1 == summas2)
            System.out.println("Среднее арифметические значения двух массивов равны");
        else {
            if (summas1 > summas2)
            System.out.println("Среднее арифметическое значение первого массива больше");
        else
            System.out.println("Среднее арифметическое значение второго массива больше");
        }
    }
}

