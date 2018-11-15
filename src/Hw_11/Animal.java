package Hw_11;

import java.util.Objects;

public class Animal {
    public int age;
    public String name;
    public  int mass;
    public void move (){
        System.out.println("It moves");
    }

    public Animal(int age, String name, int mass) {
        this.age = age;
        this.name = name;
        this.mass = mass;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }
    public void eat(){
        this.mass += 300;
        System.out.println("Ono poelo na 300 gramm");
    }
    public void breath(){
        System.out.println("Ono dishit");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return getAge() == animal.getAge() &&
                getMass() == animal.getMass() &&
                Objects.equals(getName(), animal.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getName(), getMass());
    }
}

