package Hw_10;

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

}
