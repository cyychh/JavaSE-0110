package demo.day04;

public class Student {

    private String id;
    private String name;
    private int grade;

    public Student(String id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

}
 /*定义一个学生类，包含三个属性（学号，姓名，成绩）均为私有的
    ，分别给这三个属性定义两个方法，一个设置它的值，另一个获得它的值。
     在一个测试类里调用
     */