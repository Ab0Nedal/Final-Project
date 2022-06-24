package project;

public class AddTeacher extends javax.swing.JFrame {

    public AddTeacher() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelName = new javax.swing.JLabel();
        TextFieldAddress = new javax.swing.JTextField();
        TextFieldName = new javax.swing.JTextField();
        TextFieldPassword = new javax.swing.JTextField();
        TextFieldBasicSalary = new javax.swing.JTextField();
        LabelName1 = new javax.swing.JLabel();
        LabelName7 = new javax.swing.JLabel();
        LabelName3 = new javax.swing.JLabel();
        TextFieldClassCount = new javax.swing.JTextField();
        TextFieldID = new javax.swing.JTextField();
        LabelName8 = new javax.swing.JLabel();
        TextFieldPhoneNumber = new javax.swing.JTextField();
        LabelName4 = new javax.swing.JLabel();
        TextFieldEmail = new javax.swing.JTextField();
        ButtonEnd = new javax.swing.JButton();
        ButtonBefore = new javax.swing.JButton();
        LLL = new javax.swing.JLabel();
        LabelName6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Teacher");

        LabelName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LabelName.setForeground(new java.awt.Color(0, 204, 204));
        LabelName.setText("Name Teacher :");

        TextFieldAddress.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        TextFieldAddress.setForeground(new java.awt.Color(0, 204, 204));
        TextFieldAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        TextFieldName.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        TextFieldName.setForeground(new java.awt.Color(0, 204, 204));
        TextFieldName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNameActionPerformed(evt);
            }
        });

        TextFieldPassword.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        TextFieldPassword.setForeground(new java.awt.Color(0, 204, 204));
        TextFieldPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        TextFieldBasicSalary.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        TextFieldBasicSalary.setForeground(new java.awt.Color(0, 204, 204));
        TextFieldBasicSalary.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        LabelName1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LabelName1.setForeground(new java.awt.Color(0, 204, 204));
        LabelName1.setText("ID Teacher        :");

        LabelName7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LabelName7.setForeground(new java.awt.Color(0, 204, 204));
        LabelName7.setText("BasicSalary Teacher :");

        LabelName3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LabelName3.setForeground(new java.awt.Color(0, 204, 204));
        LabelName3.setText("Password Teacher :");

        TextFieldClassCount.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        TextFieldClassCount.setForeground(new java.awt.Color(0, 204, 204));
        TextFieldClassCount.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        TextFieldID.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        TextFieldID.setForeground(new java.awt.Color(0, 204, 204));
        TextFieldID.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        LabelName8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LabelName8.setForeground(new java.awt.Color(0, 204, 204));
        LabelName8.setText("ClassCount Teacher :");

        TextFieldPhoneNumber.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        TextFieldPhoneNumber.setForeground(new java.awt.Color(0, 204, 204));
        TextFieldPhoneNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        LabelName4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LabelName4.setForeground(new java.awt.Color(0, 204, 204));
        LabelName4.setText("PhoneNumber Teacher :");

        TextFieldEmail.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        TextFieldEmail.setForeground(new java.awt.Color(0, 204, 204));
        TextFieldEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ButtonEnd.setBackground(new java.awt.Color(0, 204, 204));
        ButtonEnd.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ButtonEnd.setForeground(new java.awt.Color(255, 255, 255));
        ButtonEnd.setText("End");
        ButtonEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEndActionPerformed(evt);
            }
        });

        ButtonBefore.setBackground(new java.awt.Color(0, 204, 204));
        ButtonBefore.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ButtonBefore.setForeground(new java.awt.Color(255, 255, 255));
        ButtonBefore.setText("Before");
        ButtonBefore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBeforeActionPerformed(evt);
            }
        });

        LLL.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LLL.setForeground(new java.awt.Color(0, 204, 204));
        LLL.setText("Email Teacher :");

        LabelName6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LabelName6.setForeground(new java.awt.Color(0, 204, 204));
        LabelName6.setText("Address Teacher :");

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Add Teacher");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonBefore, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(LabelName6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(50, 50, 50))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LabelName4)
                                        .addComponent(LabelName7)
                                        .addComponent(LLL, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelName8)
                                .addGap(37, 37, 37)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextFieldClassCount)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TextFieldPhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                    .addComponent(TextFieldEmail)
                                    .addComponent(TextFieldBasicSalary))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(TextFieldAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelName1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelName3)
                            .addComponent(LabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextFieldName)
                            .addComponent(TextFieldPassword)
                            .addComponent(TextFieldID, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))))
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelName3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelName1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextFieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelName6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelName4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LLL, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelName7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldBasicSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelName8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldClassCount, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonBefore, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    HomeInterface sc = null;
    private void ButtonEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEndActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_ButtonEndActionPerformed

    HomeInterface s;
    private void ButtonBeforeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBeforeActionPerformed
        if (s == null) {
            s = new HomeInterface();
            s.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_ButtonBeforeActionPerformed

    private void TextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldNameActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(AddTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTeacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBefore;
    private javax.swing.JButton ButtonEnd;
    private javax.swing.JLabel LLL;
    private javax.swing.JLabel LabelName;
    private javax.swing.JLabel LabelName1;
    private javax.swing.JLabel LabelName3;
    private javax.swing.JLabel LabelName4;
    private javax.swing.JLabel LabelName6;
    private javax.swing.JLabel LabelName7;
    private javax.swing.JLabel LabelName8;
    public javax.swing.JTextField TextFieldAddress;
    public javax.swing.JTextField TextFieldBasicSalary;
    public javax.swing.JTextField TextFieldClassCount;
    public javax.swing.JTextField TextFieldEmail;
    public javax.swing.JTextField TextFieldID;
    public javax.swing.JTextField TextFieldName;
    public javax.swing.JTextField TextFieldPassword;
    public javax.swing.JTextField TextFieldPhoneNumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
