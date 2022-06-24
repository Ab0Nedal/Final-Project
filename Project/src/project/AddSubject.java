package project;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AddSubject extends javax.swing.JFrame {

//    CountOfStudent cc = new CountOfStudent(this);
    ArrayList<Student> TenthClassStudents = new ArrayList<>();
    ArrayList<Student> NinthClassStudents = new ArrayList<>();
    ArrayList<Student> EighthClassStudents = new ArrayList<>();

    ArrayList<Teacher> TenthClassTeacher = new ArrayList<>();
    ArrayList<Teacher> NinthClassTeacher = new ArrayList<>();
    ArrayList<Teacher> EighthClassTeacher = new ArrayList<>();

    ArrayList<Subject> StorageSubject = new ArrayList<>();

    public AddSubject() {
        initComponents();

        TenthClassStudents.add(Ahmed);
        TenthClassStudents.add(Hamza);
        TenthClassStudents.add(Yazan);

        NinthClassStudents.add(Ibrahim);
        NinthClassStudents.add(Alaa);
        NinthClassStudents.add(Ali);
        NinthClassStudents.add(Zain);

        EighthClassStudents.add(Yasser);
        EighthClassStudents.add(Mahmoud);

        TenthClassTeacher.add(Basil);
        TenthClassTeacher.add(Malek);

        NinthClassTeacher.add(Basil);
        NinthClassTeacher.add(Ehab);

        EighthClassTeacher.add(Malek);
        EighthClassTeacher.add(Ehab);

        LabelStudent1.setText("Eighth Class Students :");
        LabelStudent2.setText("Ninth Class Students :");
        LabelStudent3.setText("Tenth Class Students :");

        LabelTeacher1.setText("Eighth Class Teachers :");
        LabelTeacher2.setText("Ninth Class Teachers :");
        LabelTeacher3.setText("Tenth Class Teachers :");

        Label1.setText(TenthClassStudents.get(0).getName());
        Label2.setText(TenthClassStudents.get(1).getName());
        Label3.setText(TenthClassStudents.get(2).getName());

        Label4.setText(NinthClassStudents.get(0).getName());
        Label5.setText(NinthClassStudents.get(1).getName());
        Label6.setText(NinthClassStudents.get(2).getName());

        Label7.setText(EighthClassStudents.get(0).getName());
        Label8.setText(EighthClassStudents.get(1).getName());
        Label9.setText(NinthClassStudents.get(3).getName());

        Label10.setText(TenthClassTeacher.get(0).getName());
        Label11.setText(TenthClassTeacher.get(1).getName());

        Label12.setText(NinthClassTeacher.get(0).getName());
        Label13.setText(NinthClassTeacher.get(1).getName());

        Label14.setText(EighthClassTeacher.get(0).getName());
        Label15.setText(EighthClassTeacher.get(1).getName());

    }

    Student Ahmed = new Student("Ahmed", "0", "1");
    Student Mahmoud = new Student("Mahmoud", "0", "4");
    Student Zain = new Student("Zain", "3", "2");
    Student Yasser = new Student("Yasser", "1", "3");
    Student Ali = new Student("Ali", "4", "5");
    Student Alaa = new Student("Alaa", "10", "2");
    Student Ibrahim = new Student("Ibrahim", "22", "1");
    Student Yazan = new Student("Yazan", "12", "4");
    Student Hamza = new Student("Hamza", "9", "4");

    Teacher Basil = new Teacher("Basil", "3", "Gaza", "0592205797", "Null", "234", ABORT, ABORT);
    Teacher Malek = new Teacher("Malek", "0", "Gaza", "0592205678", "Null", "567", ABORT, ABORT);
    Teacher Ehab = new Teacher("Ehab", "2", "Gaza", "0592205678", "Null", "597", ABORT, ABORT);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField6 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TextFiledStudent = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TextFiledTeacher = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TextFiledSubject = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        javax.swing.JButton ButtonOK = new javax.swing.JButton();
        javax.swing.JButton ButtonBefore = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Label1 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        Label3 = new javax.swing.JLabel();
        LabelStudent2 = new javax.swing.JLabel();
        Label4 = new javax.swing.JLabel();
        Label5 = new javax.swing.JLabel();
        Label6 = new javax.swing.JLabel();
        LabelStudent3 = new javax.swing.JLabel();
        Label7 = new javax.swing.JLabel();
        Label8 = new javax.swing.JLabel();
        Label9 = new javax.swing.JLabel();
        LabelStudent1 = new javax.swing.JLabel();
        LabelTeacher1 = new javax.swing.JLabel();
        Label10 = new javax.swing.JLabel();
        Label11 = new javax.swing.JLabel();
        LabelTeacher2 = new javax.swing.JLabel();
        Label12 = new javax.swing.JLabel();
        Label13 = new javax.swing.JLabel();
        LabelTeacher3 = new javax.swing.JLabel();
        Label14 = new javax.swing.JLabel();
        Label15 = new javax.swing.JLabel();

        jTextField6.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jTextField6.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel2.setText("Enter Name of Subject :");

        TextFiledStudent.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        TextFiledStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFiledStudentActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel3.setText("Enter Class of Teacher :");

        TextFiledTeacher.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        TextFiledTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFiledTeacherActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 0, 19)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Note :  Pass any object of student and  object of teacher that does not exist. The course is not  added");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel5.setText("Enter Class of Student :");

        TextFiledSubject.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        TextFiledSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFiledSubjectActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Names of exists students");

        ButtonOK.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        ButtonOK.setText("Ok");
        ButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonOKActionPerformed(evt);
            }
        });

        ButtonBefore.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        ButtonBefore.setText("Before");

        jLabel8.setBackground(new java.awt.Color(204, 204, 0));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("Names of exists Teachers");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("choose student and Teacher ");

        Label1.setBackground(new java.awt.Color(204, 204, 0));
        Label1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Label1.setText("jLabel7");

        Label2.setBackground(new java.awt.Color(204, 204, 0));
        Label2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Label2.setText("jLabel7");

        Label3.setBackground(new java.awt.Color(204, 204, 0));
        Label3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Label3.setText("jLabel7");

        LabelStudent2.setBackground(new java.awt.Color(204, 204, 0));
        LabelStudent2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LabelStudent2.setText("jLabel1");

        Label4.setBackground(new java.awt.Color(204, 204, 0));
        Label4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Label4.setText("jLabel7");

        Label5.setBackground(new java.awt.Color(204, 204, 0));
        Label5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Label5.setText("jLabel7");

        Label6.setBackground(new java.awt.Color(204, 204, 0));
        Label6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Label6.setText("jLabel7");

        LabelStudent3.setBackground(new java.awt.Color(204, 204, 0));
        LabelStudent3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LabelStudent3.setText("jLabel1");

        Label7.setBackground(new java.awt.Color(204, 204, 0));
        Label7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Label7.setText("jLabel7");

        Label8.setBackground(new java.awt.Color(204, 204, 0));
        Label8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Label8.setText("jLabel7");

        Label9.setBackground(new java.awt.Color(204, 204, 0));
        Label9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Label9.setText("jLabel7");

        LabelStudent1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LabelStudent1.setText("jLabel1");

        LabelTeacher1.setBackground(new java.awt.Color(204, 204, 0));
        LabelTeacher1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LabelTeacher1.setText("jLabel1");

        Label10.setBackground(new java.awt.Color(204, 204, 0));
        Label10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Label10.setText("jLabel7");

        Label11.setBackground(new java.awt.Color(204, 204, 0));
        Label11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Label11.setText("jLabel7");

        LabelTeacher2.setBackground(new java.awt.Color(204, 204, 0));
        LabelTeacher2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LabelTeacher2.setText("jLabel1");

        Label12.setBackground(new java.awt.Color(204, 204, 0));
        Label12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Label12.setText("jLabel7");

        Label13.setBackground(new java.awt.Color(204, 204, 0));
        Label13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Label13.setText("jLabel7");

        LabelTeacher3.setBackground(new java.awt.Color(204, 204, 0));
        LabelTeacher3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LabelTeacher3.setText("jLabel1");

        Label14.setBackground(new java.awt.Color(204, 204, 0));
        Label14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Label14.setText("jLabel7");

        Label15.setBackground(new java.awt.Color(204, 204, 0));
        Label15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Label15.setText("jLabel7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(311, 311, 311))
            .addGroup(layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(LabelStudent3, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Label9, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(Label7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(jLabel8))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LabelTeacher1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label10, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label11, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(LabelTeacher2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label12, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label13, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(LabelTeacher3, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label14, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label15, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(27, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelStudent1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(LabelStudent2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label8, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addComponent(ButtonBefore, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(jLabel9))
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextFiledSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(158, 158, 158)
                                    .addComponent(TextFiledStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(159, 159, 159)
                                    .addComponent(TextFiledTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 871, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelStudent2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14)
                                        .addComponent(Label3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(LabelStudent1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Label5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(Label6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Label8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(LabelStudent3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Label7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Label9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(LabelTeacher1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Label11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(LabelTeacher2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Label12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Label13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(LabelTeacher3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label14, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Label15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFiledSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFiledStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFiledTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonBefore, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFiledStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFiledStudentActionPerformed

    }//GEN-LAST:event_TextFiledStudentActionPerformed

    private void TextFiledSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFiledSubjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFiledSubjectActionPerformed

    private void ButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonOKActionPerformed
        Subject s = null;

        if (TextFiledStudent.getText().equals("Eighth Class Students") && TextFiledTeacher.getText().equals("Eighth Class Teachers")) {
            s = new Subject(TextFiledSubject.getText(), EighthClassTeacher, EighthClassStudents);
            this.setVisible(false);
        } else if (TextFiledStudent.getText().equals("Eighth Class Students") && TextFiledTeacher.getText().equals("Ninth Class Teachers")) {
            s = new Subject(TextFiledSubject.getText(), NinthClassTeacher, EighthClassStudents);
            this.setVisible(false);
        } else if (TextFiledStudent.getText().equals("Eighth Class Students") && TextFiledTeacher.getText().equals("Tenth Class Teachers")) {
            s = new Subject(TextFiledSubject.getText(), TenthClassTeacher, EighthClassStudents);
            this.setVisible(false);
        }

        if (TextFiledStudent.getText().equals("Ninth Class Students") && TextFiledTeacher.getText().equals("Eighth Class Teachers")) {
            s = new Subject(TextFiledSubject.getText(), EighthClassTeacher, NinthClassStudents);
            this.setVisible(false);
        } else if (TextFiledStudent.getText().equals("Ninth Class Students") && TextFiledTeacher.getText().equals("Ninth Class Teachers")) {
            s = new Subject(TextFiledSubject.getText(), NinthClassTeacher, NinthClassStudents);
            this.setVisible(false);
        } else if (TextFiledStudent.getText().equals("Ninth Class Students") && TextFiledTeacher.getText().equals("Tenth Class Teachers")) {
            s = new Subject(TextFiledSubject.getText(), TenthClassTeacher, NinthClassStudents);
            this.setVisible(false);
        }

        if (TextFiledStudent.getText().equals("Tenth Class Students") && TextFiledTeacher.getText().equals("Eighth Class Teachers")) {
            s = new Subject(TextFiledSubject.getText(), EighthClassTeacher, TenthClassStudents);
            this.setVisible(false);
        } else if (TextFiledStudent.getText().equals("Tenth Class Students") && TextFiledTeacher.getText().equals("Ninth Class Teachers")) {
            s = new Subject(TextFiledSubject.getText(), NinthClassTeacher, TenthClassStudents);
            this.setVisible(false);
        } else if (TextFiledStudent.getText().equals("Tenth Class Students") && TextFiledTeacher.getText().equals("Tenth Class Teachers")) {
            s = new Subject(TextFiledSubject.getText(), TenthClassTeacher, TenthClassStudents);
            this.setVisible(false);
        }

        if (s == null) {
            JOptionPane.showMessageDialog(null, "The course is not added");
            this.setVisible(false);
        }

//        StorageSubject = new ArrayList<>();
        StorageSubject.add(s);

        Subject Chemistry = new Subject("Chemistry", TenthClassTeacher, TenthClassStudents);
        Subject Biology = new Subject("Biology", NinthClassTeacher, NinthClassStudents);
        Subject Geography = new Subject("Geography", EighthClassTeacher, EighthClassStudents);

        StorageSubject.add(Chemistry);
        StorageSubject.add(Biology);
        StorageSubject.add(Geography);

    }//GEN-LAST:event_ButtonOKActionPerformed

    private void TextFiledTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFiledTeacherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFiledTeacherActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSubject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label10;
    private javax.swing.JLabel Label11;
    private javax.swing.JLabel Label12;
    private javax.swing.JLabel Label13;
    private javax.swing.JLabel Label14;
    private javax.swing.JLabel Label15;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label4;
    private javax.swing.JLabel Label5;
    private javax.swing.JLabel Label6;
    private javax.swing.JLabel Label7;
    private javax.swing.JLabel Label8;
    private javax.swing.JLabel Label9;
    private javax.swing.JLabel LabelStudent1;
    private javax.swing.JLabel LabelStudent2;
    private javax.swing.JLabel LabelStudent3;
    private javax.swing.JLabel LabelTeacher1;
    private javax.swing.JLabel LabelTeacher2;
    private javax.swing.JLabel LabelTeacher3;
    public javax.swing.JTextField TextFiledStudent;
    public javax.swing.JTextField TextFiledSubject;
    public javax.swing.JTextField TextFiledTeacher;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
