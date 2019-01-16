package demo.day02;

import java.util.Scanner;
public class _03_work {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int max = m > n ? m : n;
        int min = m < n ? m : n;
        int j=0;
        for(int i=min;i<=max;i--){
            if(max%i==0){
                j=i;
                if(min%j==0){
                    System.out.println("m和n最大公约数:"+j);
                    break;
                }
            }
        }
        for (int a = 1; ; a++) {
            int b=max*a;
            if (b%min==0){
                System.out.println("m和n最小公倍数："+b);
                break;
            }

        }
    }
    }