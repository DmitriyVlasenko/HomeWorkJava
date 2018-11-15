package Hw_11;

import java.util.Objects;

public class Women extends Human {
    public final boolean women = true;
    public int jewelry_cost;

    public Women(int age, String name, int mass, int salary, String raсе, int jewelry_cost) {
        super(age, name, mass, salary, raсе);
        jewelry_cost = jewelry_cost;
    }

    public boolean isWomen() {
        return women;
    }

    public int getJewelry_cost() {
        return jewelry_cost;
    }

    public void setJewelry_cost(int jewelry_cost) {
        this.jewelry_cost = jewelry_cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Women women1 = (Women) o;
        return isWomen() == women1.isWomen() &&
                getJewelry_cost() == women1.getJewelry_cost();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isWomen(), getJewelry_cost());
    }
}
