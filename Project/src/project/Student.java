package project;

public class Student {

    private String Name, ID, Level;
//    private double ;

    public Student() {
    }

    public Student(String Name, String ID, String Level) {
        this.Name = Name;
        this.ID = ID;
        this.Level = Level;
    }

    public Student(Student s) {
        this.Name = s.Name;
        this.ID = s.ID;
        this.Level = s.Level;
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

    public String getLevel() {
        return Level;
    }

    public void setLevel(String Level) {
        this.Level = Level;
    }

    @Override
    public String toString() {
        return "Student{" + "Name=" + Name + ", ID=" + ID + ", Level=" + Level + '}';
    }

}
