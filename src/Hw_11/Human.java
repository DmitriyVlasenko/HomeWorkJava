package Hw_11;

import java.util.Objects;

public class Human extends Animal {
    private final boolean Intellegent = true;
    public int salary;
    public String raсе;
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public Human(int age, String name, int mass, int salary, String raсе) {
        super(age, name, mass);
        this.salary = salary;
        this.raсе = raсе;
    }

    public void think(){
        if (!this.Intellegent){
            System.out.println("It can`t think");
        }
        else {
            System.out.println("Thinking");
        }
    }

    public boolean isIntellegent() {
        return Intellegent;
    }

    public String getRaсе() {
        return raсе;
    }

    public void setRaсе(String raсе) {
        this.raсе = raсе;
    }
        public void eat(int mass){
            this.mass = mass+1000;
            System.out.println("Poel");
        }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return isIntellegent() == human.isIntellegent() &&
                getSalary() == human.getSalary() &&
                Objects.equals(getRaсе(), human.getRaсе());
    }

    @Override
    public int hashCode() {
        return Objects.hash(isIntellegent(), getSalary(), getRaсе());
    }
}
