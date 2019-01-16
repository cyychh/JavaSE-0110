package demo.day05;

import sun.security.util.Password;

import java.util.Scanner;

public class ATM {
    private static Object Password;

    public static void main(String... args){
        Scanner sc=new Scanner(System.in);
        double money=200;
        do{
            System.out.println("请选择业务:1)插卡登录 2)密码验证 3)取款 4)存款 5)查询余额 6)修改密码");
            int c=sc.nextInt();
            if(c==1){
                System.out.println("插卡成功");
            }
            if(c==2){
                System.out.println("请输入密码");
                Scanner  scn1 = new Scanner(System.in);
                String Password =scn1.nextLine();
               if(Password == "000"){
                   System.out.println("密码正确，请进行下一步");
               }else
                   System.out.println("密码不正确，请重新输入");
                   String P =scn1.nextLine();
            }
            if(c==3 ){
                while(true){
                    System.out.println("请输入取款金额:");
                    double load=sc.nextDouble();
                    if(load>=money){
                        System.out.println("账户余额不足,请重新输入取款金额");
                        continue;
                    }else{
                        money-=load;
                        System.out.println("取款成功");
                        break;
                    }
                }
            }else if(c==4){
                System.out.println("请输入存款金额:");
                money+=sc.nextDouble();
                System.out.println("存款成功");
            }else if(c==5){
                System.out.println("用户余额为:"+money+"元");
            }else if(c==6){
                System.out.println("请输入当前密码");
                if(Password=="000"){
                    System.out.println("请输入新的密码");
                }else
                    System.out.println("密码输入不正确，请重新输入");
            }
        }while(true);
    }
}


