

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTable;
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
public class Configuration {

    public Configuration() {
    }

    public Doctor findDoctorByName(String name) {
        for (Doctor doctors : AddDoctorFrame.doctorList) {
            if (doctors.getName().equals(name)) {
                return doctors;
            }
        }
        return null;
    }
    // model class and data listner 

    public void loadDefaultDoctors() {
        if (AddDoctorFrame.doctorList.isEmpty()) {
            AddDoctorFrame.doctorList.add(new Doctor("Dr. Sheldon Cooper", "Bhaktapur", "Night", 10000));
            AddDoctorFrame.doctorList.add(new Doctor("Dr. Amy Farrah Fowler", "Koteshor", "Morning", 12000));
            AddDoctorFrame.doctorList.add(new Doctor("Dr. Leonard Hofstadter", "Kalanki", "Evening", 15000));
            AddDoctorFrame.doctorList.add(new Doctor("Dr. Rajesh Koothrappali", "Kalimati", "Afternoon", 18000));
            AddDoctorFrame.doctorList.add(new Doctor("Dr. Barry Kripke", "Maitighar", "Afternoon", 10500));
            AddDoctorFrame.doctorList.add(new Doctor("Dr. Bernadette Wolowitz", "Putalisadak", "Night", 20000));
            AddDoctorFrame.doctorList.add(new Doctor("Dr. Steven Strange", "Thapathali", "Evening", 1000));
            AddDoctorFrame.doctorList.add(new Doctor("Dr. Who", "Kamal Pokhari", "Morning", 25000));
        }
    }

    public void loadDefaultPatient() {
        if (AddPatientFrame.patientList.isEmpty()) {
            AddPatientFrame.patientList.add(new Patient("Jim Halpert", 39, "Male", "Bhaktapur", "Low", findDoctorByName("Dr. Sheldon Cooper")));
            AddPatientFrame.patientList.add(new Patient("Jenna Fischer", 44, "Female", "Kamalpokhari", "High", findDoctorByName("Dr. Who")));
            AddPatientFrame.patientList.add(new Patient("Steve Carell", 56, "Male", "Kalanki", "Critical", findDoctorByName("Dr. Barry Kripke")));
            AddPatientFrame.patientList.add(new Patient("Rainn Wilson", 52, "Male", "Sukedhara", "Medium", findDoctorByName("Dr. Leonard Hofstadter")));
            AddPatientFrame.patientList.add(new Patient("Angela Kinsey", 47, "Female", "Bhaktapur", "Low", findDoctorByName("Dr. Rajesh Koothrappali")));
            AddPatientFrame.patientList.add(new Patient("Mindy Kaling", 39, "Female", "Pulchok", "High", findDoctorByName("Dr. Sheldon Cooper")));
            AddPatientFrame.patientList.add(new Patient("Ed Helms", 44, "Male", "Lalitpur", "Medium", findDoctorByName("Dr. Steven Strange")));

        }
    }

    public void addDoctorsToTable(JTable patientTable) {

        DefaultTableModel model = (DefaultTableModel) patientTable.getModel();
        for (Patient patient : AddPatientFrame.patientList) {
            model.addRow(new Object[]{});
            int myRow = model.getRowCount() - 1;
            patientTable.setValueAt(patient.getName(), myRow, 0);
            patientTable.setValueAt(patient.getAge(), myRow, 1);
            patientTable.setValueAt(patient.getSex(), myRow, 2);
            patientTable.setValueAt(patient.getSeverity(), myRow, 3);
            patientTable.setValueAt(patient.getDoctor().getName(), myRow, 4);

        }
    }

    public void closeFrameAfer(JFrame frame) {
        // this is for making so that this frame would close after half a second(500 ms) before main frame would close
        // simple fix that would flicker the screen while changing the tab.
        Timer timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        timer.setRepeats(false);
        timer.start();
    }

    public void setIconAndTitle(JFrame frame, String title) {
        frame.setTitle("Hospital Management System - " + title); // setting the title of the frame
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("./img/favicon.png"))); // setting the icon image
    }
    public void selectDoctorForPatient(JComboBox box){
        for(Doctor doctor :  AddDoctorFrame.doctorList){
            box.addItem(doctor.getName());
        }
    
    }

}
