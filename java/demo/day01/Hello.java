package demo.day01;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        int x=1;
        int y=2;
        int z=x+y;
        System.out.println(z);
        z=x-y;
        System.out.println(z);
        z=x/y;
        System.out.println(z);
        z=x%y;
        System.out.println(z);

        double a=1.2;
        double b=3.4;
        System.out.println(a<b);
        System.out.println(a==b);
        System.out.println(a<=b);

        String m="chen";
        String n=new String("chen");
        System.out.println(m==n);

        boolean q=true;
        boolean p=false;
        System.out.println(q&p);
        System.out.println(q|p);
        System.out.println(q^p);
        System.out.println(q&&p);
        System.out.println(q||p);

        String str1="hello";
        String str2="hi";
        int s=(str1.length()<str2.length())?1:2;
        System.out.println(s);

        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入分数");
        int score=scanner.nextInt();
        System.out.println(score);
        char grade;
        grade=(score>=85)?'A':(score>=60)?'B':'C';
        System.out.println(grade);
    }
}

