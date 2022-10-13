package test2;

public class task27 {
    public static void main(String[] args) {
        int mas[] = new int[12];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int)(Math.random() * 16);
            System.out.print(mas[i] + " ");
        }
        System.out.println(" ");

        int max = mas[0];
        int index = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] >= max ) {
                max = mas[i];
                index = i;
            }
        }
        System.out.println("Самое большое число " + max + " и индекс его последнего вхождения " + index);
    }
}



