package Hw_10;

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
}
