package demo.day02;

public class _02_switch {
    public static void main(String[] args) {
        char grade='A';
        switch(grade){
            case'A':
                System.out.println("优");
                break;
            case'B':
                System.out.println("良");
                break;
            case'C':
                System.out.println("中");
                break;
            case'D':
                System.out.println("差");
                break;
        }
    }
}
