package test2;

import java.util.Scanner;

public class task210 {
    public static void main(String[] args){
        int n = 0;
        int a = 0;

        System.out.println("Введите число большее 3");
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        if (n < 3) {
            System.out.println("Ошибка");
            System.exit(0);
        }
        int[] mas1 = new int[n];
        for(int i = 0; i < mas1.length; i++){
            mas1[i] = (int)(Math.random() * (n+1));
            System.out.print(mas1[i] +  " ");
            if(mas1[i] % 2 == 0)
                a++;
        }
        System.out.println(" ");
        if(a > 0) {
            int[] mas2 = new int[a];
            int index = 0;
            for(int i = 0; i < mas1.length; i++) {
                if (mas1[i] % 2 == 0) {
                    mas2[index] = mas1[i];
                    System.out.print(mas2[index] + " ");
                }
            }
        }
    }
}