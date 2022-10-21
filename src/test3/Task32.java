package test3;

import java.util.Scanner;

public class Task32 {
    public static void main(String[] agrs) {
        int size = 0;
        int a;
        int b;
        int nech = 0;

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
            for (int j = 0; j < mas[i].length; j++) {
                if (j <= i && mas[i][j] % 2 != 0) {
                nech = mas[i][j];
                System.out.print(nech + " ");
            }else{
                    System.out.print("");
                }
            }
        }
    }
}