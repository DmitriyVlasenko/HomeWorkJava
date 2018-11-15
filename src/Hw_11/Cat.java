package Hw_11;

import java.util.Objects;

public class Cat extends Animal {
    public final int legs_count =4;
    public int lives = 9;

    public int getLegs_count() {
        return legs_count;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public Cat(int age, String name, int mass) {
        super(age, name, mass);
    }
    public void suicide(){
        if(this.getLives()>1){
            this.lives = this.getLives()-1;

        }
        else {
            System.out.println("It died");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return getLegs_count() == cat.getLegs_count() &&
                getLives() == cat.getLives();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLegs_count(), getLives());
    }
}
