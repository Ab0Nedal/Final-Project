package project;

public class Manger extends Employee {

    private double MangerBonus;

    public Manger() {
    }

    public Manger(String Name, String ID, String Address, String PhoneNumber, String Email, String Password, double BasicSalary, double MangerBonus) {
        super(Name, ID, Address, PhoneNumber, Email, Password, BasicSalary);
        this.MangerBonus = MangerBonus;
    }

    public double getMangerBonus() {
        return MangerBonus;
    }

    public void setMangerBonus(double MangerBonus) {
        this.MangerBonus = MangerBonus;
    }

    @Override
    public String toString() {
        return "Manger{" + "MangerBonus=" + MangerBonus + '}' + super.toString();
    }

    @Override
    public double getSalary() {
        LiveExpensive = 0.10 * BasicSalary;
        return BasicSalary + LiveExpensive + MangerBonus;
    }

}
