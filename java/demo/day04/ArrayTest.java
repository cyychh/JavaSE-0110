package demo.day04;

public class ArrayTest {
    public static void main(String[] args) {
        int[]numbers=new int[10];
        numbers[0]=1850;
        System.out.println(numbers[0]);
        System.out.println(numbers.length);
        String[] strings={"hello","hi"};
        System.out.println(strings.length);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("--------");
        for(int n:numbers){
            System.out.println(n);
        }
        for (String string : strings) {
            System.out.println(string);

        }
    }
}
