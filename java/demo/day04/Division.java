package demo.day04;

public class Division {
    private int x;
    private int y;

    public Division(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int div(){
        return x/y;
    }
    public void setY(int y){
        if(y==0){
            System.out.println("分母不能为0");
            System.exit(1);
        }else{
            this.y=y;
        }
    }
}
