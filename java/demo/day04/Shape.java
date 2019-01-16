package demo.day04;

public class Shape {
    double getArea() {
        return 0d;
    }
}

class Square extends Shape {

    double length;

    public Square(double length) {
        this.length = length;
    }

    //    double getArea() {
//        return length * length;
//    }


    @Override
    double getArea() {
        return length * length;
    }
}

