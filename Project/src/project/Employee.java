package project;

public abstract class Employee {

    protected String Name, ID, Address, PhoneNumber, Email, Password;
    protected double BasicSalary, LiveExpensive = 0.10 * BasicSalary;

    public Employee() {
    }

    public Employee(String Name, String ID, String Address, String PhoneNumber, String Email, String Password, double BasicSalary) {
        this.Name = Name;
        this.ID = ID;
        this.Address = Address;
        this.PhoneNumber = PhoneNumber;
        this.Email = Email;
        this.Password = Password;
        this.BasicSalary = BasicSalary;
        LiveExpensive = 0.10 * BasicSalary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public double getBasicSalary() {
        return BasicSalary;
    }

    public void setBasicSalary(double BasicSalary) {
        this.BasicSalary = BasicSalary;
    }

    public double getLiveExpensive() {
        LiveExpensive = 0.10 * BasicSalary;
        return LiveExpensive;
    }

    public void setLiveExpensive(double LiveExpensive) {
        this.LiveExpensive = LiveExpensive;
    }

    @Override
    public String toString() {
        LiveExpensive = 0.10 * BasicSalary;
        return "Employee{" + "Name=" + Name + ", ID=" + ID + ", Address=" + Address + ", PhoneNumber=" + PhoneNumber + ", Email=" + Email + ", Password=" + Password + ", BasicSalary=" + BasicSalary + ", LiveExpensive=" + LiveExpensive + '}';
    }

    public abstract double getSalary();
}
