package test2;

public class task21 {
    public static void main(String[] args) {
        int a = 0;

        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0)
                a++;
        }
        int[] mas = new int[a];
        int index = 0;
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) {
                mas[index] = i;
                System.out.print(mas[index] + " ");
                index++;
            }
        }
        System.out.println(" ");

        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }
    }
}


