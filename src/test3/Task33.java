package test3;

import java.util.Scanner;

public class Task33 {
    public static void main(String[] agrs) {
        int size = 0;
        int a;
        int b;
        int sum1 = 1;
        int sum2 = 1;

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
                if (i == j)
                    sum1 = sum1 * mas[i][j];
            }
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (j == mas.length - i - 1)
                    sum2 = sum2 * mas[i][j];
            }
        }
        if(sum1 > sum2){
            System.out.print("Главная диагональ больше");
        }else{
            System.out.print("Побочная даигональ больше");
        }
    }
}