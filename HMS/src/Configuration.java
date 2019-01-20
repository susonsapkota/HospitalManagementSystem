
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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

    public static ArrayList<Doctor> doctorList = new ArrayList<>();
    public static ArrayList<Patient> patientList = new ArrayList<>();

    public Configuration() {
    }

    public Doctor findDoctorByName(String name) {
        for (Doctor doctors : Configuration.doctorList) {
            if (doctors.getName().equals(name)) {
                return doctors;
            }
        }
        return null;
    }
    // model class and data listner 

    public void loadDefaultDoctors() {
        if (Configuration.doctorList.isEmpty()) {
            Configuration.doctorList.add(new Doctor("Dr. Sheldon Cooper", "Bhaktapur", "Night", 10000));
            Configuration.doctorList.add(new Doctor("Dr. Amy Farrah Fowler", "Koteshor", "Morning", 12000));
            Configuration.doctorList.add(new Doctor("Dr. Leonard Hofstadter", "Kalanki", "Evening", 15000));
            Configuration.doctorList.add(new Doctor("Dr. Rajesh Koothrappali", "Kalimati", "Afternoon", 18000));
            Configuration.doctorList.add(new Doctor("Dr. Barry Kripke", "Maitighar", "Afternoon", 10500));
            Configuration.doctorList.add(new Doctor("Dr. Bernadette Wolowitz", "Putalisadak", "Night", 20000));
            Configuration.doctorList.add(new Doctor("Dr. Steven Strange", "Thapathali", "Evening", 1000));
            Configuration.doctorList.add(new Doctor("Dr. Who", "Kamal Pokhari", "Morning", 25000));
        }
    }

    public void loadDefaultPatient() {
        if (Configuration.patientList.isEmpty()) {
            Configuration.patientList.add(new Patient("Jim Halpert", 39, "Male", "Bhaktapur", "Low", findDoctorByName("Dr. Sheldon Cooper")));
            Configuration.patientList.add(new Patient("Jenna Fischer", 44, "Female", "Kamalpokhari", "High", findDoctorByName("Dr. Who")));
            Configuration.patientList.add(new Patient("Steve Carell", 56, "Male", "Kalanki", "Critical", findDoctorByName("Dr. Barry Kripke")));
            Configuration.patientList.add(new Patient("Rainn Wilson", 52, "Male", "Sukedhara", "Medium", findDoctorByName("Dr. Leonard Hofstadter")));
            Configuration.patientList.add(new Patient("Angela Kinsey", 47, "Female", "Bhaktapur", "Low", findDoctorByName("Dr. Rajesh Koothrappali")));
            Configuration.patientList.add(new Patient("Mindy Kaling", 39, "Female", "Pulchok", "High", findDoctorByName("Dr. Sheldon Cooper")));
            Configuration.patientList.add(new Patient("Ed Helms", 44, "Male", "Lalitpur", "Medium", findDoctorByName("Dr. Steven Strange")));

        }
    }

    public void addPatientToTable(JTable table) {

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        for (Patient patient : Configuration.patientList) {
            model.addRow(new Object[]{});
            int myRow = model.getRowCount() - 1;
            table.setValueAt(patient.getName(), myRow, 0);
            table.setValueAt(patient.getAge(), myRow, 1);
            table.setValueAt(patient.getSex(), myRow, 2);
            table.setValueAt(patient.getAddress(), myRow, 3);
            table.setValueAt(patient.getSeverity(), myRow, 4);
            table.setValueAt(patient.getDoctor().getName(), myRow, 5);

        }

    }

    public void addDoctorToTable(JTable table) {

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        for (Doctor doctor : Configuration.doctorList) {
            model.addRow(new Object[]{});
            int myRow = model.getRowCount() - 1;
            table.setValueAt(doctor.getName(), myRow, 0);
            table.setValueAt(doctor.getAddress(), myRow, 1);
            table.setValueAt(doctor.getShift(), myRow, 2);
            table.setValueAt(doctor.getSalary(), myRow, 3);

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

    public void selectDoctorForPatient(JComboBox box) {
        for (Doctor doctor : Configuration.doctorList) {
            box.addItem(doctor.getName());
        }

    }

    public void displayDoctor(JFrame frame, Doctor doc) {
        JOptionPane.showMessageDialog(frame, "Doctor Name : " + doc.getName()
                + "\nAddress : " + doc.getAddress()
                + "\nShift : " + doc.getShift()
                + "\nSalary : " + doc.getSalary(),
                doc.getName(), JOptionPane.INFORMATION_MESSAGE);
    }

    public String[] copyDocToTempList(ArrayList<Doctor> doc, String keyword) {
        String[] tempList = new String[doc.size()];
        int i = 0;
        if (keyword.equals("Name")) {
            for (Doctor docs : doc) {
                tempList[i] = docs.getName();
                i++;
            }
            return tempList;
        } else if (keyword.equals("Address")) {
            for (Doctor docs : doc) {
                tempList[i] = docs.getAddress();
                i++;
            }
            return tempList;
        } else if (keyword.equals("Shift")) {
            for (Doctor docs : doc) {
                tempList[i] = docs.getShift();
                i++;
            }
            return tempList;
        } else if (keyword.equals("Salary")) {
            for (Doctor docs : doc) {
                tempList[i] = Integer.toString(docs.getSalary());
                i++;
            }
            return tempList;
        }
        return tempList;
    }

    public String[] copyPatientToTempList(ArrayList<Patient> patient, String keyword) {
        String[] tempList = new String[patient.size()];
        int i = 0;
        if (keyword.equals("Name")) {
            for (Patient patnt : patient) {
                tempList[i] = patnt.getName();
                i++;
            }
            return tempList;
        } else if (keyword.equals("Address")) {
            for (Patient patnt : patient) {
                tempList[i] = patnt.getAddress();
                i++;
            }
            return tempList;
        } else if (keyword.equals("Age")) {
            for (Patient patnt : patient) {
                tempList[i] = Integer.toString(patnt.getAge());
                i++;
            }
            return tempList;
        } else if (keyword.equals("Sex")) {
            for (Patient patnt : patient) {
                tempList[i] = patnt.getSex();
                i++;
            }
            return tempList;
        } else if (keyword.equals("Doctor")) {
            for (Patient patnt : patient) {
                tempList[i] = patnt.getDoctor().getName();
                i++;
            }
            return tempList;
        } else if (keyword.equals("Severity")) {
            for (Patient patnt : patient) {
                tempList[i] = patnt.getSeverity();
                i++;
            }
            return tempList;
        }

        return tempList;
    }

    public ArrayList<Doctor> searchingAccordingToKeyword(String[] sorted, String keyword) {

        ArrayList<Doctor> tempDoc = new ArrayList<>();

        for (String name : sorted) {

            if (keyword.equals("Name")) {
                for (Doctor doc : Configuration.doctorList) {
                    if (doc.getName().equals(name) && !(tempDoc.contains(doc))) {
                        tempDoc.add(doc);
                    }
                }
                return tempDoc;
            } else if (keyword.equals("Address")) {
                for (Doctor doc : Configuration.doctorList) {
                    if (doc.getAddress().equals(name) && !(tempDoc.contains(doc))) {
                        tempDoc.add(doc);
                    }
                }
            } else if (keyword.equals("Shift")) {
                for (Doctor doc : Configuration.doctorList) {
                    if (doc.getShift().equals(name) && !(tempDoc.contains(doc))) {
                        tempDoc.add(doc);
                    }
                }
            } else if (keyword.equals("Salary")) {
                for (Doctor doc : Configuration.doctorList) {
                    if (doc.getSalary() == Integer.parseInt(name) && !(tempDoc.contains(doc))) {
                        tempDoc.add(doc);
                    }
                }
            }

        }
        return tempDoc;
    }

    public int moreOnDoctorList(String keyword, String searched) {
        int count = 0;

        if (searched.equals("Name")) {
            for (Doctor doc : Configuration.doctorList) {
                if (doc.getName().equals(keyword)) {
                    count++;
                }
            }

        } else if (searched.equals("Address")) {
            for (Doctor doc : Configuration.doctorList) {
                if (doc.getAddress().equals(keyword)) {
                    count++;
                }

            }
        } else if (searched.equals("Shift")) {
            for (Doctor doc : Configuration.doctorList) {
                if (doc.getShift().equals(keyword)) {
                    count++;
                }

            }
        } else if (searched.equals("Salary")) {
            for (Doctor doc : Configuration.doctorList) {
                if (doc.getSalary() == Integer.parseInt(keyword)) {
                    count++;
                }

            }
        }
        if (count > 0) {
            return count - 1;
        } else {
            return 0;
        }

    }

    public int moreOnPatientList(String keyword, String searched) {
        int count = 0;

        if (searched.equals("Name")) {
            for (Patient pat : Configuration.patientList) {
                if (pat.getName().equals(keyword)) {
                    count++;
                }
            }

        } else if (searched.equals("Sex")) {
            for (Patient pat : Configuration.patientList) {
                if (pat.getSex().equals(keyword)) {
                    count++;
                }

            }
        } else if (searched.equals("Address")) {
            for (Patient pat : Configuration.patientList) {
                if (pat.getAddress().equals(keyword)) {
                    count++;
                }

            }
        } else if (searched.equals("Age")) {
            for (Patient pat : Configuration.patientList) {
                if (pat.getAge() == Integer.parseInt(keyword)) {
                    count++;
                }

            }
        } else if (searched.equals("Severity")) {
            for (Patient pat : Configuration.patientList) {
                if (pat.getSeverity().equals(keyword)) {
                    count++;
                }

            }
        } else if (searched.equals("Doctor")) {
            for (Patient pat : Configuration.patientList) {
                if (pat.getDoctor().getName().equals(keyword)) {
                    count++;
                }

            }
        }
        if (count > 0) {
            return count - 1;
        } else {
            return 0;
        }

    }
    
}
