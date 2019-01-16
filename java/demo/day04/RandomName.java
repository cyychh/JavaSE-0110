package demo.day04;

import java.util.Random;

public class RandomName {
    public static void main(String[] args) {
        String names[]={"刘立超","邓超元","赵明睿", "赵晨锦",
                "金谡","杨斌","杨恒", "李静雅","王强","师尧",
                "吴凯平", "韩思远", "陈慧慧","李欣", "王一茗",
                "李奕霖","苏宏月","赵灿","陈月芳"};
        for (int i = 0; i < names.length; i++) {
        }
        Random ran=new Random();
        int index=ran.nextInt(names.length);
        System.out.println(names[index]);
    }
}
