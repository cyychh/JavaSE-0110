package demo.day04;

public class Human {
    private String name;
    private int age;
    private  char gender;
    private double height;
    private boolean married;
    public Human(){

    }

    public Human(String name, int age, char gender, double height, boolean married) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.married = married;
    }
    public void study(){
        test();
        System.out.println(name+"is studying...");
    }
    public void work(){
        test();
        System.out.println(name+"is working...");
    }
    private void test(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
}
