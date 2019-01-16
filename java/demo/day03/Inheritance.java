package demo.day03;

public class Inheritance {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.brand);
        car.run();
    }
    }
    class Vehicle {
        String color;
        double spend;
        String brand;

        public Vehicle() {

        }

        public Vehicle(String color,double spend,String brand) {
            this.color = color;
            this.spend = spend;
            this.brand = brand;
        }

        void run(){
            System.out.println("run...");
        }
        void stop() {
        }
        }
        class Car extends Vehicle{
        }



