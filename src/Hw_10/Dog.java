package Hw_10;

public class Dog extends  Animal {
    public final int legs_count =4;
    public int speed;

    public int getLegs_count() {
        return legs_count;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Dog(int age, String name, int mass, int speed) {
        super(age, name, mass);
        this.speed = speed;
    }
}
