package test2;

public class task26 {
    public static void main(String[] args) {
        int[] Mas = new int[4];
        for(int i = 0; i < Mas.length; i++) {
            Mas[i] =((int)(Math.random() * 90) + 10);
            System.out.print(Mas[i] + " ");
        }
        System.out.println(" ");

        for(int i = 0; i < Mas.length; i++) {
            if(i > 0) {
                if(Mas[i-1] >= Mas[i]) {
                    System.out.println("Последовательность не возрастающая");
                    break;
                }
            }
            if(i == Mas.length - 1)
                System.out.println("Последовательность строго возрастающая");
        }
    }
}