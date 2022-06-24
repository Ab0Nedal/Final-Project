package project;

import java.util.ArrayList;
import java.util.Scanner;

public class School {

    public static void main(String[] args) {
//        {
//
//            StorageSubject.add(Chemistry);
//            System.out.println(StorageSubject.get(0).getName());
//        }

        ArrayList<Employee> StorageEmployyes = new ArrayList();
        ArrayList<Student> NinthClassStudents = new ArrayList<>();
        ArrayList<Teacher> NinthClassTeacher = new ArrayList<>();
        ArrayList<Subject> StorageSubject = new ArrayList<>();

        Manger m1 = new Manger("Ahmed", "0", "Gaza", "0563453451", "Ahmmed2003@gamil.com", "MMMM", 2000, 250);
        Manger m2 = new Manger("Mohammed", "1", "Gaza", "0593478906", "Mohammed2003@gamil.com", "123", 2500, 350);
        Teacher t1 = new Teacher("Yaser", "0", "rafah", "0599887721", "Yaser2003@gamil.com", "YYYY", 1550, 4);
        Teacher t2 = new Teacher("Tareq", "1", "rafah", "0596564721", "Tareq2003@gamil.com", "TTTT", 1620, 3);

        Subject Chemistry = new Subject("Chemistry", NinthClassTeacher, NinthClassStudents);

        StorageEmployyes.add(m1);
        StorageEmployyes.add(m2);
        StorageEmployyes.add(t1);
        StorageEmployyes.add(t2);

        StorageSubject.add(Chemistry);

        Student s = new Student("", "", "");
        Student ss = new Student("", "", "");

        NinthClassStudents.add(s);
        NinthClassStudents.add(ss);

        Scanner in = new Scanner(System.in);

        if (in.next().equals(StorageSubject.get(0).getName())) {
            System.out.println(String.valueOf(StorageSubject.get(0).CountOfStudent()));
        }

//        ArrayList<Student> students = new ArrayList<>();
//        Manger m = new Manger("Moahmmed", "2", "Gaza", "0593478906", "mabomousa@smail.ucas.edu.ps", "000056", 2000, 800);
//        ArrayList<Teacher> teachers = new ArrayList<>();
//        ArrayList<Subject> subjects = new ArrayList<>();
// لتسجيل الدخول في الواجهه
//        String s = null;
//        String s1 = null;
//        System.out.println("Enter Name :");
//        String N = in.nextLine();
//        System.out.println("Enter Password:");
//        String p = in.nextLine();
//        for (int i = 0; i < StorageEmployyes.size(); i++) {
//            if ((StorageEmployyes.get(i).getName()).equals(N) && (StorageEmployyes.get(i).getPassword()).equals(p)) {
//                s = "mohammed";
//            } 
//        }
//        if ((N.equals(m1.getName()) && p.equals(m1.getPassword())) || (N.equals(m2.getName()) && p.equals(m2.getPassword())) || (N.equals(t1.getName()) && p.equals(t1.getPassword())) || (N.equals(t2.getName()) && p.equals(t2.getPassword()))) {
//            s = "mohammed";
//        } else {
//            s1 = "Yaser";
//        }
//        System.out.println(s);
//        System.out.println(s1);
//        Teacher t = new Teacher("Ahmed", "0", "Rafah", "00000000", "Null", "09090", 1400, 4);
//        Student s1 = new Student("Mohammed", "1", 1);
//        Student s2 = new Student("Ezz", "2", 3);
//        Student s3 = new Student("Basil", "2", 3);
//        Student s4 = new Student("Ahmed", "2", 3);
//
//        Subject su = new Subject("Math", teachers, students);
//
//        students.add(s1);
//        students.add(s2);
//        students.add(s3);
//      
//        System.out.println(su.CountOfStudent());
    }

}
