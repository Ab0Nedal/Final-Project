package project;

public class AddManger extends javax.swing.JFrame {

    public AddManger() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextFieldName2 = new javax.swing.JTextField();
        LabelName = new javax.swing.JLabel();
        TextFieldName = new javax.swing.JTextField();
        TextFieldPassword = new javax.swing.JTextField();
        LabelName1 = new javax.swing.JLabel();
        LabelName3 = new javax.swing.JLabel();
        TextFieldID = new javax.swing.JTextField();
        TextFieldPhoneNumber = new javax.swing.JTextField();
        LabelName4 = new javax.swing.JLabel();
        TextFieldEmail = new javax.swing.JTextField();
        LabelName5 = new javax.swing.JLabel();
        LabelName6 = new javax.swing.JLabel();
        TextFieldAddress = new javax.swing.JTextField();
        TextFieldSalary = new javax.swing.JTextField();
        LabelName7 = new javax.swing.JLabel();
        TextFieldBouns = new javax.swing.JTextField();
        LabelName8 = new javax.swing.JLabel();
        ButtonEnd = new javax.swing.JButton();
        ButtonBefore = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        TextFieldName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldName2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Manger");

        LabelName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LabelName.setForeground(new java.awt.Color(0, 204, 204));
        LabelName.setText("Name Manger :");

        TextFieldName.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        TextFieldName.setForeground(new java.awt.Color(0, 204, 204));
        TextFieldName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        TextFieldPassword.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        TextFieldPassword.setForeground(new java.awt.Color(0, 204, 204));
        TextFieldPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldPasswordActionPerformed(evt);
            }
        });

        LabelName1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LabelName1.setForeground(new java.awt.Color(0, 204, 204));
        LabelName1.setText("ID Manger        :");

        LabelName3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LabelName3.setForeground(new java.awt.Color(0, 204, 204));
        LabelName3.setText("Password Manger :");

        TextFieldID.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        TextFieldID.setForeground(new java.awt.Color(0, 204, 204));
        TextFieldID.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        TextFieldPhoneNumber.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        TextFieldPhoneNumber.setForeground(new java.awt.Color(0, 204, 204));
        TextFieldPhoneNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        LabelName4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LabelName4.setForeground(new java.awt.Color(0, 204, 204));
        LabelName4.setText("PhoneNumber Manger :");

        TextFieldEmail.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        TextFieldEmail.setForeground(new java.awt.Color(0, 204, 204));
        TextFieldEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        LabelName5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LabelName5.setForeground(new java.awt.Color(0, 204, 204));
        LabelName5.setText("Email Manger :");

        LabelName6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LabelName6.setForeground(new java.awt.Color(0, 204, 204));
        LabelName6.setText("Address Manger :");

        TextFieldAddress.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        TextFieldAddress.setForeground(new java.awt.Color(0, 204, 204));
        TextFieldAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        TextFieldSalary.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        TextFieldSalary.setForeground(new java.awt.Color(0, 204, 204));
        TextFieldSalary.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        LabelName7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LabelName7.setForeground(new java.awt.Color(0, 204, 204));
        LabelName7.setText("BasicSalary Manger :");

        TextFieldBouns.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        TextFieldBouns.setForeground(new java.awt.Color(0, 204, 204));
        TextFieldBouns.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        LabelName8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LabelName8.setForeground(new java.awt.Color(0, 204, 204));
        LabelName8.setText("MangerBonus Manger :");

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

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Manger");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LabelName8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextFieldBouns, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonBefore, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(LabelName4)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(LabelName6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGap(52, 52, 52)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(LabelName5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(90, 90, 90)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(LabelName7)
                                            .addGap(36, 36, 36)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LabelName1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(78, 78, 78)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(LabelName3)
                                    .addGap(53, 53, 53)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextFieldName)
                            .addComponent(TextFieldPassword)
                            .addComponent(TextFieldID)
                            .addComponent(TextFieldAddress)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TextFieldPhoneNumber)
                                    .addComponent(TextFieldSalary, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                    .addComponent(TextFieldEmail, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(LabelName5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelName7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelName8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldBouns, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonBefore, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldName2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldName2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldName2ActionPerformed

    HomeInterface se;
    private void ButtonEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEndActionPerformed
        se = new HomeInterface(this);
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

    private void TextFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldPasswordActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddManger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddManger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddManger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddManger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddManger().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBefore;
    private javax.swing.JButton ButtonEnd;
    private javax.swing.JLabel LabelName;
    private javax.swing.JLabel LabelName1;
    private javax.swing.JLabel LabelName3;
    private javax.swing.JLabel LabelName4;
    private javax.swing.JLabel LabelName5;
    private javax.swing.JLabel LabelName6;
    private javax.swing.JLabel LabelName7;
    private javax.swing.JLabel LabelName8;
    public javax.swing.JTextField TextFieldAddress;
    public javax.swing.JTextField TextFieldBouns;
    public javax.swing.JTextField TextFieldEmail;
    public javax.swing.JTextField TextFieldID;
    public javax.swing.JTextField TextFieldName;
    public javax.swing.JTextField TextFieldName2;
    public javax.swing.JTextField TextFieldPassword;
    public javax.swing.JTextField TextFieldPhoneNumber;
    public javax.swing.JTextField TextFieldSalary;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
