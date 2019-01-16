package demo.day04;

public class RandomTest {
    public static void main(String[] args) {
        System.out.println(Math.random());
        for (int i = 0; i < 10000; i++) {
            double r=Math.random();
            int n=(int)(r*20)+1;
            System.out.println(n);
        }
    }
}
