package demo.day04;

public class Calculator {
    double add(double a,double b){
        return a+b;
    }
    double add(int x,double y){
        return x+y;
    }
    String add(int x,int y){
        return x+""+y;
    }
    String add(double x,int y){
        return x+""+y;
    }
}
