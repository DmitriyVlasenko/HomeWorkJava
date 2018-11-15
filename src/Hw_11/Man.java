package Hw_11;

import java.util.Objects;

public class Man extends Human {
    public final boolean man = true;
    public boolean beard;
    public Man(int age, String name, int mass, int salary, String raсе, boolean beard) {
        super(age, name, mass, salary, raсе);
        this.beard = beard;
    }


    public boolean isMan() {
        return man;
    }

    public boolean isBeard() {
        return beard;
    }

    public void setBeard(boolean beard) {
        this.beard = beard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Man man1 = (Man) o;
        return isMan() == man1.isMan() &&
                isBeard() == man1.isBeard();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isMan(), isBeard());
    }
}
