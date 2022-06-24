package project;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CountOfStudent extends javax.swing.JFrame {

    public CountOfStudent() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelName = new javax.swing.JLabel();
        TextFieldName = new javax.swing.JTextField();
        LabelNumber = new javax.swing.JLabel();
        TextFieldNumber = new javax.swing.JTextField();
        ButtonOK = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LabelName.setForeground(new java.awt.Color(0, 204, 204));
        LabelName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelName.setText("Enter name subject :");

        TextFieldName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TextFieldName.setForeground(new java.awt.Color(0, 204, 204));
        TextFieldName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNameActionPerformed(evt);
            }
        });

        LabelNumber.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LabelNumber.setForeground(new java.awt.Color(0, 204, 204));
        LabelNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelNumber.setText("The number students are registered in this subject :");

        TextFieldNumber.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TextFieldNumber.setForeground(new java.awt.Color(0, 204, 204));
        TextFieldNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextFieldNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNumberActionPerformed(evt);
            }
        });

        ButtonOK.setBackground(new java.awt.Color(0, 204, 204));
        ButtonOK.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        ButtonOK.setForeground(new java.awt.Color(255, 255, 255));
        ButtonOK.setText("OK");
        ButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonOKActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setForeground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Count of student in any subject");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(ButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(TextFieldNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(ButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldNumber))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void TextFieldNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNumberActionPerformed


    }//GEN-LAST:event_TextFieldNumberActionPerformed

    AddSubject as = new AddSubject();

    private void ButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonOKActionPerformed

        if (TextFieldName.getText().equals("Eighth Class Students")) {
            TextFieldNumber.setText("" + as.EighthClassStudents.size());
        } else if (TextFieldName.getText().equals("Ninth Class Students")) {
            TextFieldNumber.setText("" + as.NinthClassStudents.size());

        } else if (TextFieldName.getText().equals("Tenth Class Students")) {
            TextFieldNumber.setText("" + as.TenthClassStudents.size());
        } else{
                    JOptionPane.showMessageDialog(null, "Please check the class name");

        }


    }//GEN-LAST:event_ButtonOKActionPerformed

    private void TextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldNameActionPerformed

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
            java.util.logging.Logger.getLogger(CountOfStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CountOfStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CountOfStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CountOfStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CountOfStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonOK;
    private javax.swing.JLabel LabelName;
    private javax.swing.JLabel LabelNumber;
    private javax.swing.JTextField TextFieldName;
    private javax.swing.JTextField TextFieldNumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
