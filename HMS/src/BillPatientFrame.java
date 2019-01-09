
import java.awt.Toolkit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Suson
 */
public class BillPatientFrame extends javax.swing.JFrame {

    /**
     * Creates new form AddPatientFrames
     */
    public BillPatientFrame() {
       Configuration config = new Configuration();
       config.setIconAndTitle(this, "Change this ");
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        manageButton = new javax.swing.JButton();
        addPatientButton = new javax.swing.JButton();
        addDoctorButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        assignPatientButton = new javax.swing.JButton();
        helpTextButton = new javax.swing.JButton();
        contactButton = new javax.swing.JButton();
        viewDoctorsButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 0));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(450, 1080));
        jPanel1.setMinimumSize(new java.awt.Dimension(450, 1080));
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 1080));

        manageButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        manageButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dashboard.png"))); // NOI18N
        manageButton.setText(" Manage Patients");
        manageButton.setActionCommand("  Manage Patients");
        manageButton.setAlignmentY(0.0F);
        manageButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240))));
        manageButton.setBorderPainted(false);
        manageButton.setFocusPainted(false);
        manageButton.setFocusable(false);
        manageButton.setMargin(new java.awt.Insets(0, 14, 0, 14));
        manageButton.setMaximumSize(new java.awt.Dimension(180, 60));
        manageButton.setMinimumSize(new java.awt.Dimension(180, 60));
        manageButton.setPreferredSize(new java.awt.Dimension(180, 60));
        manageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageButtonActionPerformed(evt);
            }
        });

        addPatientButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addPatientButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        addPatientButton.setText(" Add Patient");
        addPatientButton.setAlignmentY(0.0F);
        addPatientButton.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        addPatientButton.setBorderPainted(false);
        addPatientButton.setFocusPainted(false);
        addPatientButton.setFocusable(false);
        addPatientButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        addPatientButton.setMargin(new java.awt.Insets(0, 14, 0, 14));
        addPatientButton.setMaximumSize(new java.awt.Dimension(180, 60));
        addPatientButton.setMinimumSize(new java.awt.Dimension(180, 60));
        addPatientButton.setPreferredSize(new java.awt.Dimension(180, 60));
        addPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPatientButtonActionPerformed(evt);
            }
        });

        addDoctorButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addDoctorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/student (1).png"))); // NOI18N
        addDoctorButton.setText("  Add Doctor");
        addDoctorButton.setActionCommand("     Add Doctor");
        addDoctorButton.setAlignmentY(0.0F);
        addDoctorButton.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        addDoctorButton.setBorderPainted(false);
        addDoctorButton.setFocusPainted(false);
        addDoctorButton.setFocusable(false);
        addDoctorButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        addDoctorButton.setMargin(new java.awt.Insets(0, 14, 0, 14));
        addDoctorButton.setMaximumSize(new java.awt.Dimension(180, 60));
        addDoctorButton.setMinimumSize(new java.awt.Dimension(180, 60));
        addDoctorButton.setPreferredSize(new java.awt.Dimension(180, 60));
        addDoctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDoctorButtonActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setMaximumSize(new java.awt.Dimension(363, 278));
        jPanel3.setMinimumSize(new java.awt.Dimension(363, 278));
        jPanel3.setPreferredSize(new java.awt.Dimension(450, 278));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minsss.jpg"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(180, 47));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        assignPatientButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        assignPatientButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/addDetails.png"))); // NOI18N
        assignPatientButton.setText(" Assign Patient");
        assignPatientButton.setAlignmentY(0.0F);
        assignPatientButton.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        assignPatientButton.setBorderPainted(false);
        assignPatientButton.setFocusPainted(false);
        assignPatientButton.setFocusable(false);
        assignPatientButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        assignPatientButton.setMargin(new java.awt.Insets(0, 14, 0, 14));
        assignPatientButton.setMaximumSize(new java.awt.Dimension(180, 60));
        assignPatientButton.setMinimumSize(new java.awt.Dimension(180, 60));
        assignPatientButton.setPreferredSize(new java.awt.Dimension(180, 60));
        assignPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignPatientButtonActionPerformed(evt);
            }
        });

        helpTextButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        helpTextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/manual.png"))); // NOI18N
        helpTextButton.setText("      Help Text");
        helpTextButton.setAlignmentY(0.0F);
        helpTextButton.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        helpTextButton.setBorderPainted(false);
        helpTextButton.setFocusPainted(false);
        helpTextButton.setFocusable(false);
        helpTextButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        helpTextButton.setMargin(new java.awt.Insets(0, 14, 0, 14));
        helpTextButton.setMaximumSize(new java.awt.Dimension(180, 60));
        helpTextButton.setMinimumSize(new java.awt.Dimension(180, 60));
        helpTextButton.setPreferredSize(new java.awt.Dimension(180, 60));
        helpTextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpTextButtonActionPerformed(evt);
            }
        });

        contactButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        contactButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/contact.png"))); // NOI18N
        contactButton.setAlignmentY(0.0F);
        contactButton.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        contactButton.setBorderPainted(false);
        contactButton.setFocusPainted(false);
        contactButton.setFocusable(false);
        contactButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        contactButton.setLabel("      Contact Us");
        contactButton.setMargin(new java.awt.Insets(0, 14, 0, 14));
        contactButton.setMaximumSize(new java.awt.Dimension(180, 60));
        contactButton.setMinimumSize(new java.awt.Dimension(180, 60));
        contactButton.setPreferredSize(new java.awt.Dimension(180, 60));
        contactButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactButtonActionPerformed(evt);
            }
        });

        viewDoctorsButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        viewDoctorsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/doc.png"))); // NOI18N
        viewDoctorsButton.setText(" View Doctors");
        viewDoctorsButton.setAlignmentY(0.0F);
        viewDoctorsButton.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        viewDoctorsButton.setBorderPainted(false);
        viewDoctorsButton.setFocusPainted(false);
        viewDoctorsButton.setFocusable(false);
        viewDoctorsButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        viewDoctorsButton.setMargin(new java.awt.Insets(0, 14, 0, 14));
        viewDoctorsButton.setMaximumSize(new java.awt.Dimension(180, 60));
        viewDoctorsButton.setMinimumSize(new java.awt.Dimension(180, 60));
        viewDoctorsButton.setPreferredSize(new java.awt.Dimension(180, 60));
        viewDoctorsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDoctorsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addDoctorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assignPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(helpTextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactButton, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewDoctorsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addDoctorButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(assignPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewDoctorsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
                .addComponent(helpTextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contactButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        jPanel4.setBackground(new java.awt.Color(100, 149, 237));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1463, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPatientButtonActionPerformed
        // TODO add your handling code here:
        new AddPatientFrame();
        setVisible(false);
    }//GEN-LAST:event_addPatientButtonActionPerformed

    private void manageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manageButtonActionPerformed

    private void addDoctorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDoctorButtonActionPerformed
        // TODO add your handling code here:
        new AddDoctorFrame();
        setVisible(false);
    }//GEN-LAST:event_addDoctorButtonActionPerformed

    private void assignPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignPatientButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_assignPatientButtonActionPerformed

    private void helpTextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpTextButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_helpTextButtonActionPerformed

    private void contactButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactButtonActionPerformed
        // TODO add your handling code here:
        new AboutUsFrame();
        setVisible(false);
    }//GEN-LAST:event_contactButtonActionPerformed

    private void viewDoctorsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDoctorsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewDoctorsButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDoctorButton;
    private javax.swing.JButton addPatientButton;
    private javax.swing.JButton assignPatientButton;
    private javax.swing.JButton contactButton;
    private javax.swing.JButton helpTextButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton manageButton;
    private javax.swing.JButton viewDoctorsButton;
    // End of variables declaration//GEN-END:variables
}
