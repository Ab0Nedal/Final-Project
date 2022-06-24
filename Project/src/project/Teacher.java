package project;

public class Teacher extends Employee {

    private int ClassCount;

    public Teacher() {
    } 

    public Teacher(String Name, String ID, String Address, String PhoneNumber, String Email, String Password, double BasicSalary, int ClassCount) {
        super(Name, ID, Address, PhoneNumber, Email, Password, BasicSalary);
        this.ClassCount = ClassCount;
    }

    public int getClassCount() {
        return ClassCount;
    }

    public void setClassCount(int ClassCount) {
        this.ClassCount = ClassCount;
    }

    @Override
    public String toString() {
        return "Teacher{" + "ClassCount=" + ClassCount + '}' + super.toString();
    }

    @Override
    public double getSalary() {
        LiveExpensive = 0.10 * BasicSalary;
        return BasicSalary + LiveExpensive + (20 * ClassCount);
    }

}
