package project;

import java.util.ArrayList;

public class HomeInterface extends javax.swing.JFrame {

    public HomeInterface() {
        initComponents();
    }

    ArrayList<Manger> StorageManger = new ArrayList<>();
    ArrayList<Teacher> StorageTeacher = new ArrayList<>();
    ArrayList<Student> StorageStudents = new ArrayList<>();

    AddStudent s;
    AddTeacher t;
    Teacher te;
    AddManger m;
    Manger mn;

    public HomeInterface(AddManger m) {
        this();
        this.m = m;
        double SalaryManger = Double.parseDouble(m.TextFieldSalary.getText());
        double BounsManger = Double.parseDouble(m.TextFieldBouns.getText());
        mn = new Manger(m.TextFieldName.getText(), m.TextFieldID.getText(), m.TextFieldAddress.getText(), m.TextFieldPhoneNumber.getText(), m.TextFieldEmail.getText(), m.TextFieldPassword.getText(), SalaryManger, BounsManger);
    }

    public HomeInterface(AddTeacher t) {
        this();
        this.t = t;
        double SalaryTeacher = Double.parseDouble(t.TextFieldBasicSalary.getText());
        Integer ClassCountTeacher = Integer.parseInt(t.TextFieldClassCount.getText());
        te = new Teacher(t.TextFieldName.getText(), t.TextFieldID.getText(), t.TextFieldAddress.getText(), t.TextFieldPhoneNumber.getText(), t.TextFieldEmail.getText(), t.TextFieldPassword.getText(), SalaryTeacher, ClassCountTeacher);
        StorageTeacher.add(te);

    }

    public HomeInterface(AddStudent s) {
        this();
        this.s = s;
        Student stu = new Student(s.TextFieldName.getText(), s.TextFieldID.getText(), s.TextFieldLevel.getText());
        StorageStudents.add(stu);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ButtonShow3 = new javax.swing.JButton();
        ButtonShow2 = new javax.swing.JButton();
        ButtonShow1 = new javax.swing.JButton();
        ButtonShow = new javax.swing.JButton();
        ButtonStudent1 = new javax.swing.JButton();
        ButtonStudent = new javax.swing.JButton();
        ButtonEmployee = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" Home");

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setForeground(new java.awt.Color(204, 51, 0));

        jLabel1.setBackground(new java.awt.Color(0, 51, 153));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" Home Interface");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        ButtonShow3.setBackground(new java.awt.Color(255, 255, 255));
        ButtonShow3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ButtonShow3.setForeground(new java.awt.Color(0, 204, 204));
        ButtonShow3.setText("Exit");
        ButtonShow3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonShow3ActionPerformed(evt);
            }
        });

        ButtonShow2.setBackground(new java.awt.Color(255, 255, 255));
        ButtonShow2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ButtonShow2.setForeground(new java.awt.Color(0, 204, 204));
        ButtonShow2.setText("Save data in file");
        ButtonShow2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonShow2ActionPerformed(evt);
            }
        });

        ButtonShow1.setBackground(new java.awt.Color(255, 255, 255));
        ButtonShow1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ButtonShow1.setForeground(new java.awt.Color(0, 204, 204));
        ButtonShow1.setText("Count of student in any subject");
        ButtonShow1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonShow1ActionPerformed(evt);
            }
        });

        ButtonShow.setBackground(new java.awt.Color(255, 255, 255));
        ButtonShow.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ButtonShow.setForeground(new java.awt.Color(0, 204, 204));
        ButtonShow.setText("Show Employees Salaries ");
        ButtonShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonShowActionPerformed(evt);
            }
        });

        ButtonStudent1.setBackground(new java.awt.Color(255, 255, 255));
        ButtonStudent1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ButtonStudent1.setForeground(new java.awt.Color(0, 204, 204));
        ButtonStudent1.setText("Add Subject");
        ButtonStudent1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonStudent1ActionPerformed(evt);
            }
        });

        ButtonStudent.setBackground(new java.awt.Color(255, 255, 255));
        ButtonStudent.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ButtonStudent.setForeground(new java.awt.Color(0, 204, 204));
        ButtonStudent.setText("Add Student");
        ButtonStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonStudentActionPerformed(evt);
            }
        });

        ButtonEmployee.setBackground(new java.awt.Color(255, 255, 255));
        ButtonEmployee.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ButtonEmployee.setForeground(new java.awt.Color(0, 204, 204));
        ButtonEmployee.setText("Add Employee");
        ButtonEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEmployeeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ButtonShow3, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonShow2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonShow1)
                    .addComponent(ButtonShow, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonStudent1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ButtonEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonStudent1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonShow, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonShow1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonShow2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonShow3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonStudentActionPerformed
        if (a == null) {
            a = new AddStudent();
            a.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_ButtonStudentActionPerformed

    private void ButtonShow3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonShow3ActionPerformed
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonShow3ActionPerformed

    private void ButtonShow2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonShow2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonShow2ActionPerformed

    private void ButtonShow1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonShow1ActionPerformed
        if (cof == null) {
            cof = new CountOfStudent();
            cof.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_ButtonShow1ActionPerformed

    private void ButtonShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonShowActionPerformed
        if (ss == null) {
            ss = new ShowSalariesFrame(ff);
            ss.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_ButtonShowActionPerformed

    private void ButtonStudent1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonStudent1ActionPerformed
        if (as == null) {
            as = new AddSubject();
            as.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_ButtonStudent1ActionPerformed

    private void ButtonEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEmployeeActionPerformed
        if (c == null) {
            c = new Choose();
            c.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_ButtonEmployeeActionPerformed
CountOfStudent cof = null ;
    AddStudent a = null;    Choose c = null;    AddSubject as;
    SignIn ff = new SignIn();
    ShowSalariesFrame ss = null;
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonEmployee;
    private javax.swing.JButton ButtonShow;
    private javax.swing.JButton ButtonShow1;
    private javax.swing.JButton ButtonShow2;
    private javax.swing.JButton ButtonShow3;
    private javax.swing.JButton ButtonStudent;
    private javax.swing.JButton ButtonStudent1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
