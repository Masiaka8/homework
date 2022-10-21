package test3;

import java.util.Scanner;

public class Task35 {
    public static void main(String[] agrs) {
        int size = 0;
        int a;
        int b;

        System.out.println("Введите размер массива: ");
        Scanner scn = new Scanner(System.in);
        size = scn.nextInt();

        a = size;
        b = size;

        int[][] mas = new int[a][b];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = (int) (Math.random() * 51);
                System.out.printf("%1d\t", mas[i][j]);
            }
            System.out.println(" ");
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = i + 1; j < mas.length; j++) {
                int index = mas[i][j];
                mas[i][j] = mas[j][i];
                mas[j][i] = index;
            }
        }
        System.out.println();
        System.out.println("Новая матрица");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                System.out.printf("%1d\t", mas[i][j]);
            }
            System.out.println();
        }

    }
}