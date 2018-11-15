package Hw_10;

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
    public int work (String race){
        if (race != "White"){
            return 10;
        }
        return 20;
    }
    public void think(boolean intellegent){
        if (!intellegent){
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
}
