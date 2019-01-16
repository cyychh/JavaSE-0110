package demo.day02;

public class _02_work {
    public static void main(String[] args) {
        for (int i = 100; i <1000 ; i++) {
            if(i==((i%10)*(i%10)*(i%10)+(i/100)*(i/100)*(i/100)+
                    (i/10%10)*(i/10%10)*(i/10%10))){
            System.out.println(i);
        }
    }
}
}