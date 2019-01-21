package hms;

import java.awt.Desktop;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Suson
 */
public class MainFrame extends javax.swing.JFrame {
    
    Configuration config;

    /**
     * Creates new form AddPatientFrames
     */
    public MainFrame() {
        config = new Configuration();
        config.setIconAndTitle(this, "Home");
        initComponents();
        config.loadDefaultDoctors();
        config.loadDefaultPatient();
        
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
        viewPatientButton = new javax.swing.JButton();
        helpTextButton = new javax.swing.JButton();
        contactButton = new javax.swing.JButton();
        viewDoctorsButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        toText = new javax.swing.JLabel();
        HospitalText = new javax.swing.JLabel();
        welcomeText1 = new javax.swing.JLabel();
        iconLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        openMenu = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        exitMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        aboutUsMenu = new javax.swing.JMenuItem();
        userGuideMenu = new javax.swing.JMenuItem();

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

        jPanel1.setBackground(new java.awt.Color(192, 192, 192));
        jPanel1.setMaximumSize(new java.awt.Dimension(450, 1080));
        jPanel1.setMinimumSize(new java.awt.Dimension(450, 1080));
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 1080));

        manageButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        manageButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dashboard.png"))); // NOI18N
        manageButton.setText("Home Page");
        manageButton.setActionCommand("  Manage Patients");
        manageButton.setAlignmentY(0.0F);
        manageButton.setBorder(null);
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

        viewPatientButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        viewPatientButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/addDetails.png"))); // NOI18N
        viewPatientButton.setText("  View Patient");
        viewPatientButton.setActionCommand("View Patient");
        viewPatientButton.setAlignmentY(0.0F);
        viewPatientButton.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        viewPatientButton.setBorderPainted(false);
        viewPatientButton.setFocusPainted(false);
        viewPatientButton.setFocusable(false);
        viewPatientButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        viewPatientButton.setMargin(new java.awt.Insets(0, 14, 0, 14));
        viewPatientButton.setMaximumSize(new java.awt.Dimension(180, 60));
        viewPatientButton.setMinimumSize(new java.awt.Dimension(180, 60));
        viewPatientButton.setPreferredSize(new java.awt.Dimension(180, 60));
        viewPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPatientButtonActionPerformed(evt);
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
                    .addComponent(viewPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(viewPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewDoctorsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
                .addComponent(helpTextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contactButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        jPanel4.setBackground(new java.awt.Color(69, 123, 157));

        toText.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        toText.setForeground(new java.awt.Color(255, 255, 255));
        toText.setText("To");

        HospitalText.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        HospitalText.setForeground(new java.awt.Color(255, 255, 255));
        HospitalText.setText("Created By PSP 2019 ©");
        HospitalText.setToolTipText("");

        welcomeText1.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        welcomeText1.setForeground(new java.awt.Color(255, 255, 255));
        welcomeText1.setText("Welcome");

        iconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparent.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(265, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(HospitalText)
                        .addGap(389, 389, 389))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(iconLabel)
                        .addGap(218, 218, 218))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(toText)
                        .addGap(426, 426, 426))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(welcomeText1)
                        .addGap(335, 335, 335))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(welcomeText1)
                .addGap(28, 28, 28)
                .addComponent(toText)
                .addGap(18, 18, 18)
                .addComponent(iconLabel)
                .addGap(122, 122, 122)
                .addComponent(HospitalText)
                .addContainerGap(237, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(56, 28, 87));
        jPanel5.setForeground(new java.awt.Color(56, 28, 87));

        jLabel3.setBackground(new java.awt.Color(56, 28, 87));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rsz_help.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1033, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        openMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Open.png"))); // NOI18N
        openMenu.setText("Open");
        openMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuActionPerformed(evt);
            }
        });
        jMenu1.add(openMenu);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Save.png"))); // NOI18N
        jMenuItem2.setText("Save");
        jMenuItem2.setToolTipText("");
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator1);

        exitMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        exitMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Exit resize.png"))); // NOI18N
        exitMenu.setText("Exit");
        exitMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuActionPerformed(evt);
            }
        });
        jMenu1.add(exitMenu);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        aboutUsMenu.setText("About Us");
        aboutUsMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutUsMenuActionPerformed(evt);
            }
        });
        jMenu2.add(aboutUsMenu);

        userGuideMenu.setText("User Guide");
        userGuideMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userGuideMenuActionPerformed(evt);
            }
        });
        jMenu2.add(userGuideMenu);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 584, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void viewPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPatientButtonActionPerformed
        // TODO add your handling code here:
        new ViewPatientFrame();
        setVisible(false);

    }//GEN-LAST:event_viewPatientButtonActionPerformed

    private void helpTextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpTextButtonActionPerformed
        // TODO add your handling code here:
        config.DisplayHelpPDF(this);
    }//GEN-LAST:event_helpTextButtonActionPerformed

    private void contactButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactButtonActionPerformed
        // TODO add your handling code here:
        new AboutUsFrame();
        setVisible(false);
    }//GEN-LAST:event_contactButtonActionPerformed

    private void viewDoctorsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDoctorsButtonActionPerformed
        // TODO add your handling code here:
        new ViewDoctorsFrame();
        setVisible(false);
    }//GEN-LAST:event_viewDoctorsButtonActionPerformed

    private void exitMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuActionPerformed
        // TODO add your handling code here:
        dispose();
        System.exit(0);
    }//GEN-LAST:event_exitMenuActionPerformed

    private void openMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        int r = chooser.showOpenDialog(openMenu);
        if (r == JFileChooser.APPROVE_OPTION) {
            try {
                Desktop.getDesktop().open(chooser.getSelectedFile());
            } catch (IOException e1) {
                JOptionPane.showMessageDialog(openMenu, "Could not open file " + chooser.getSelectedFile().getAbsolutePath());
            }
        }
    }//GEN-LAST:event_openMenuActionPerformed

    private void aboutUsMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutUsMenuActionPerformed
        // TODO add your handling code here:
        new AboutUsFrame();
        setVisible(false);
    }//GEN-LAST:event_aboutUsMenuActionPerformed

    private void userGuideMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userGuideMenuActionPerformed
        // TODO add your handling code here:
        config.DisplayHelpPDF(this);
    }//GEN-LAST:event_userGuideMenuActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new MainFrame().setVisible(true);
                PopUpClass popup = new PopUpClass();
                Timer timer = new Timer(600, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        popup.setLocation(470, 300);
                        popup.setVisible(true);
                        
                    }
                });
                timer.setRepeats(false);
                timer.start();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HospitalText;
    private javax.swing.JMenuItem aboutUsMenu;
    private javax.swing.JButton addDoctorButton;
    private javax.swing.JButton addPatientButton;
    private javax.swing.JButton contactButton;
    private javax.swing.JMenuItem exitMenu;
    private javax.swing.JButton helpTextButton;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JButton manageButton;
    private javax.swing.JMenuItem openMenu;
    private javax.swing.JLabel toText;
    private javax.swing.JMenuItem userGuideMenu;
    private javax.swing.JButton viewDoctorsButton;
    private javax.swing.JButton viewPatientButton;
    private javax.swing.JLabel welcomeText1;
    // End of variables declaration//GEN-END:variables
}
