package demo.day05;
import java.util.Scanner;
public class Student {
    String name;
    int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public static void main(String[] agrs) {
        choice();
    }

    private static void  choice(){

        System.out.println("欢迎来到学生管理系统");
        System.out.println("1、权限认证                   ");
        System.out.println("2、学生管理                   ");
        System.out.println("3、学生数据统计与分析         ");

        System.out.println("您想选择的操作是：");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();

        switch (a){
            case 1:
                System.out.println("您是老师吗");
                Scanner in = new Scanner(System.in);
                String name = in.next();
                if (name.equals("是")) {
                    System.out.println("恭喜您认证成功");
                }
                break;
            case 2:
                System.out.println("添加学生信息");
                Scanner inmanage = new Scanner(System.in);
                int manage = inmanage.nextInt();
                while (true){
                    System.out.print("请输入学生的姓名：");
                    Scanner Sname = new Scanner(System.in);
                    String sname = Sname.next();
                    System.out.print("请输入学生的学号：");
                    Scanner SId = new Scanner(System.in);
                    String studentId = SId.next();
                    System.out.println("恭喜你添加成功！");
                }

            case 3:
                System.out.print("请告诉我需要查询的学号：");
                Scanner CId = new Scanner(System.in);
               System.out.println("您查询的学生不存在");
                break;
               default:
                System.out.println("您输入的数字有误，请重新输入：");
                break;
        }
    }
}

