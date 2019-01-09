
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Suson
 */
public class AddDoctorFrame extends javax.swing.JFrame {

    // we allow this to be static because before we even run this class we want this list in patient class to view list of doctors
    public static ArrayList<Doctor> doctorList = new ArrayList<>();

    /**
     * Creates new form mainFrame
     */
    public AddDoctorFrame() {
        setTitle("Hospital Management System - Add Doctor"); // setting the title of the frame
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("./img/favicon.png"))); // setting the icon image
        initComponents();
        addDoctors();
        setVisible(true);

    }

    public void addDoctors() {

        DefaultTableModel model = (DefaultTableModel) doctorsTable.getModel();
        for (Doctor doctor : doctorList) {
            model.addRow(new Object[]{});
            int myRow = model.getRowCount() - 1;
            doctorsTable.setValueAt(doctor.getName(), myRow, 0);
            doctorsTable.setValueAt(doctor.getAddress(), myRow, 1);
            doctorsTable.setValueAt(doctor.getShift(), myRow, 2);
            doctorsTable.setValueAt(doctor.getSalary(), myRow, 3);

        }

    }

    public void closeFrameAfer() {
        // this is for making so that this frame would close after half a second(500 ms) before main frame would close
        // simple fix that would flicker the screen while changing the tab.
        Timer timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        timer.setRepeats(false);
        timer.start();
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
        jPanel5 = new javax.swing.JPanel();
        addDoctorLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        shiftLabel = new javax.swing.JLabel();
        shiftComboBox = new javax.swing.JComboBox<>();
        salaryLabel = new javax.swing.JLabel();
        salaryField = new javax.swing.JTextField();
        doctorIcon = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();
        addDoctorToTable = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        tableScrollPane = new javax.swing.JScrollPane();
        doctorsTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
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
        setMaximumSize(new java.awt.Dimension(1920, 1080));
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

        jPanel4.setBackground(new java.awt.Color(122, 122, 122));

        jPanel5.setBackground(new java.awt.Color(192, 192, 192));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        addDoctorLabel.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        addDoctorLabel.setForeground(new java.awt.Color(255, 255, 255));
        addDoctorLabel.setText("Add Doctor");

        nameLabel.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("Name :");

        nameField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        addressLabel.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        addressLabel.setForeground(new java.awt.Color(255, 255, 255));
        addressLabel.setText("Address :");

        addressField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        shiftLabel.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        shiftLabel.setForeground(new java.awt.Color(255, 255, 255));
        shiftLabel.setText("Shift :");

        shiftComboBox.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        shiftComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Shift--", "Morning", "Afternoon", "Evening", "Night" }));
        shiftComboBox.setMaximumSize(new java.awt.Dimension(69, 22));
        shiftComboBox.setMinimumSize(new java.awt.Dimension(69, 22));
        shiftComboBox.setPreferredSize(new java.awt.Dimension(69, 22));
        shiftComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shiftComboBoxActionPerformed(evt);
            }
        });

        salaryLabel.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        salaryLabel.setForeground(new java.awt.Color(255, 255, 255));
        salaryLabel.setText("Salary :");

        salaryField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        doctorIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/doctor.png"))); // NOI18N

        clearButton.setBackground(new java.awt.Color(159, 0, 0));
        clearButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        addDoctorToTable.setBackground(new java.awt.Color(0, 159, 0));
        addDoctorToTable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addDoctorToTable.setForeground(new java.awt.Color(255, 255, 255));
        addDoctorToTable.setText("Add Doctor");
        addDoctorToTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDoctorToTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameField)
                            .addComponent(addressField)
                            .addComponent(salaryField)
                            .addComponent(shiftComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameLabel)
                                    .addComponent(addressLabel)
                                    .addComponent(salaryLabel)
                                    .addComponent(shiftLabel))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(addDoctorLabel))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(doctorIcon)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(addDoctorToTable, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(addDoctorLabel)
                .addGap(65, 65, 65)
                .addComponent(doctorIcon)
                .addGap(71, 71, 71)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(addressLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(salaryLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salaryField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(shiftLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(shiftComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addDoctorToTable, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(192, 192, 192));

        doctorsTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        doctorsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Address", "Shift", "Salary"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        doctorsTable.setAlignmentX(2.0F);
        doctorsTable.setAlignmentY(2.0F);
        doctorsTable.setGridColor(new java.awt.Color(0, 0, 0));
        doctorsTable.setRowHeight(30);
        doctorsTable.setRowMargin(2);
        doctorsTable.getTableHeader().setResizingAllowed(false);
        doctorsTable.getTableHeader().setReorderingAllowed(false);
        doctorsTable.getTableHeader().setFont(new Font("Serif", Font.BOLD, 20));
        tableScrollPane.setViewportView(doctorsTable);
        if (doctorsTable.getColumnModel().getColumnCount() > 0) {
            doctorsTable.getColumnModel().getColumn(0).setResizable(false);
            doctorsTable.getColumnModel().getColumn(1).setResizable(false);
            doctorsTable.getColumnModel().getColumn(2).setResizable(false);
            doctorsTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel8.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Available Doctors");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableScrollPane)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(364, 364, 364)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(369, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 878, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        closeFrameAfer();

    }//GEN-LAST:event_addPatientButtonActionPerformed

    private void manageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageButtonActionPerformed
        // TODO add your handling code here:
        new MainFrame().setVisible(true);
        closeFrameAfer();
    }//GEN-LAST:event_manageButtonActionPerformed

    private void addDoctorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDoctorButtonActionPerformed
        // TODO add your handling code here:
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
        closeFrameAfer();
    }//GEN-LAST:event_contactButtonActionPerformed

    private void viewDoctorsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDoctorsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewDoctorsButtonActionPerformed

    private void shiftComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shiftComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shiftComboBoxActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // When clicked all fields should be clear
        // setting all fields text to "" or empty
        nameField.setText("");
        addressField.setText("");
        salaryField.setText("");
        shiftComboBox.setSelectedIndex(0);
    }//GEN-LAST:event_clearButtonActionPerformed

    private void addDoctorToTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDoctorToTableActionPerformed
        // implement adding doctor to table
        // this is for validation
        if (!(nameField.getText().isEmpty() || addressField.getText().isEmpty()
                || salaryField.getText().isEmpty() || shiftComboBox.getSelectedIndex() == 0)) {
            int salary = 0;
            // if users inputs strings in salary, exceptional handling is done!
            try {
                salary = Integer.parseInt(salaryField.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Please enter the valid salary in numbers", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String name = "Dr. " + nameField.getText();
            String address = addressField.getText();
            String shift = (String) shiftComboBox.getSelectedItem();

            // checking if that doctor is already added and is on table 
            for (Doctor doctors : doctorList) {
                if (doctors.getName().equals(name)) {
                    JOptionPane.showMessageDialog(rootPane, name + " is already added.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            doctorList.add(new Doctor(name, address, shift, salary));

            DefaultTableModel model = (DefaultTableModel) doctorsTable.getModel();
            model.addRow(new Object[]{});
            int myRow = model.getRowCount() - 1;

            doctorsTable.setValueAt(name, myRow, 0);
            doctorsTable.setValueAt(address, myRow, 1);
            doctorsTable.setValueAt(shift, myRow, 2);
            doctorsTable.setValueAt(salary, myRow, 3);
            
            

        } else {
            if (nameField.getText().isEmpty() || addressField.getText().isEmpty()
                    || salaryField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Please enter all valid information", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (shiftComboBox.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Please select the shift of doctor", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_addDoctorToTableActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDoctorButton;
    private javax.swing.JLabel addDoctorLabel;
    private javax.swing.JButton addDoctorToTable;
    private javax.swing.JButton addPatientButton;
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JButton assignPatientButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton contactButton;
    private javax.swing.JLabel doctorIcon;
    private javax.swing.JTable doctorsTable;
    private javax.swing.JButton helpTextButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton manageButton;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField salaryField;
    private javax.swing.JLabel salaryLabel;
    private javax.swing.JComboBox<String> shiftComboBox;
    private javax.swing.JLabel shiftLabel;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JButton viewDoctorsButton;
    // End of variables declaration//GEN-END:variables
}
