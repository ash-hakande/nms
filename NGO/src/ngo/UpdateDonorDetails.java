/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngo;

/**
 *
 * @author ash
 */
public class UpdateDonorDetails extends javax.swing.JPanel {

    /**
     * Creates new form UpdateDonorDetails
     */
    public UpdateDonorDetails() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Purisa", 0, 24)); // NOI18N
        jLabel1.setText("Update your details:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 30, 310, 60);

        jLabel2.setText("Amount to Pledge:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 170, 129, 20);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(180, 330, 210, 27);

        jLabel3.setText("Contact Details:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 210, 120, 30);

        jLabel4.setText("Phone No.:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(72, 250, 80, 20);

        jLabel5.setText("Email id:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(90, 290, 70, 20);

        jLabel6.setText("Name:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(110, 120, 45, 20);

        jLabel7.setText("Address:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(90, 330, 70, 30);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(180, 250, 210, 27);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(180, 290, 210, 27);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(180, 120, 210, 27);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(180, 170, 210, 27);

        jButton5.setText("<= Back to Home");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(420, 10, 130, 29);

        jButton1.setText("Enter");
        jPanel1.add(jButton1);
        jButton1.setBounds(230, 380, 51, 29);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Annual", "Semi-Annual", " " }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(420, 170, 110, 27);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
