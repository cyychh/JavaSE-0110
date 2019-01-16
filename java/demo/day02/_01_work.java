package demo.day02;

public class _01_work {
    public static void main(String[] args) {
        int j;
        for (int i = 101; i < 200; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                } else {
                    System.out.println(i);
                    break;
                }

            }
        }

    }
}