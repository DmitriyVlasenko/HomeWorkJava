package Hw_11;

import java.util.Objects;

public class Dog extends Animal {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return getLegs_count() == dog.getLegs_count() &&
                getSpeed() == dog.getSpeed();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLegs_count(), getSpeed());
    }
}
