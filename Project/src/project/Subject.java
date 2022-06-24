package project;

import java.util.ArrayList;

public class Subject {

    private String Name;
    ArrayList<Teacher> teachers;
    ArrayList<Student> students;

    public Subject(String Name, ArrayList<Teacher> teachers, ArrayList<Student> students) {
        this.Name = Name;
        this.teachers = teachers;
        this.students = students;

    }

    public int CountOfStudent() {
        return students.size();

    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Subject{" + "Name=" + Name + ", teachers=" + teachers + ", students=" + students + '}';
    }

}
